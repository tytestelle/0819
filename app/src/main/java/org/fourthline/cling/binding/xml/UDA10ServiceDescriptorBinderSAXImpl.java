package org.fourthline.cling.binding.xml;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import org.fourthline.cling.binding.staging.MutableAction;
import org.fourthline.cling.binding.staging.MutableActionArgument;
import org.fourthline.cling.binding.staging.MutableAllowedValueRange;
import org.fourthline.cling.binding.staging.MutableService;
import org.fourthline.cling.binding.staging.MutableStateVariable;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.meta.StateVariableEventDetails;
import org.fourthline.cling.model.types.CustomDatatype;
import org.fourthline.cling.model.types.Datatype;
import org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import org.seamless.xml.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes2.dex */
public class UDA10ServiceDescriptorBinderSAXImpl extends UDA10ServiceDescriptorBinderImpl {
    private static Logger log = Logger.getLogger(ServiceDescriptorBinder.class.getName());

    /* JADX INFO: renamed from: org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT;

        static {
            int[] iArr = new int[Descriptor.Service.ELEMENT.values().length];
            $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT = iArr;
            try {
                iArr[Descriptor.Service.ELEMENT.name.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[Descriptor.Service.ELEMENT.direction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[Descriptor.Service.ELEMENT.relatedStateVariable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[Descriptor.Service.ELEMENT.retval.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[Descriptor.Service.ELEMENT.dataType.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[Descriptor.Service.ELEMENT.defaultValue.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[Descriptor.Service.ELEMENT.allowedValue.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[Descriptor.Service.ELEMENT.minimum.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[Descriptor.Service.ELEMENT.maximum.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[Descriptor.Service.ELEMENT.step.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class ActionArgumentHandler extends ServiceDescriptorHandler<MutableActionArgument> {
        public static final Descriptor.Service.ELEMENT EL = Descriptor.Service.ELEMENT.argument;

        public ActionArgumentHandler(MutableActionArgument mutableActionArgument, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(mutableActionArgument, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void endElement(Descriptor.Service.ELEMENT element) {
            int i = AnonymousClass1.$SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[element.ordinal()];
            if (i == 1) {
                ((MutableActionArgument) getInstance()).name = getCharacters();
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    ((MutableActionArgument) getInstance()).relatedStateVariable = getCharacters();
                    return;
                } else {
                    if (i != 4) {
                        return;
                    }
                    ((MutableActionArgument) getInstance()).retval = true;
                    return;
                }
            }
            String characters = getCharacters();
            try {
                ((MutableActionArgument) getInstance()).direction = ActionArgument.Direction.valueOf(characters.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException unused) {
                UDA10ServiceDescriptorBinderSAXImpl.log.warning("UPnP specification violation: Invalid action argument direction, assuming 'IN': " + characters);
                ((MutableActionArgument) getInstance()).direction = ActionArgument.Direction.IN;
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(EL);
        }
    }

    public static class ActionArgumentListHandler extends ServiceDescriptorHandler<List<MutableActionArgument>> {
        public static final Descriptor.Service.ELEMENT EL = Descriptor.Service.ELEMENT.argumentList;

        public ActionArgumentListHandler(List<MutableActionArgument> list, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(list, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) {
            if (element.equals(ActionArgumentHandler.EL)) {
                MutableActionArgument mutableActionArgument = new MutableActionArgument();
                ((List) getInstance()).add(mutableActionArgument);
                new ActionArgumentHandler(mutableActionArgument, this);
            }
        }
    }

    public static class ActionHandler extends ServiceDescriptorHandler<MutableAction> {
        public static final Descriptor.Service.ELEMENT EL = Descriptor.Service.ELEMENT.action;

        public ActionHandler(MutableAction mutableAction, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(mutableAction, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void endElement(Descriptor.Service.ELEMENT element) {
            if (AnonymousClass1.$SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[element.ordinal()] != 1) {
                return;
            }
            ((MutableAction) getInstance()).name = getCharacters();
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) {
            if (element.equals(ActionArgumentListHandler.EL)) {
                ArrayList arrayList = new ArrayList();
                ((MutableAction) getInstance()).arguments = arrayList;
                new ActionArgumentListHandler(arrayList, this);
            }
        }
    }

    public static class ActionListHandler extends ServiceDescriptorHandler<List<MutableAction>> {
        public static final Descriptor.Service.ELEMENT EL = Descriptor.Service.ELEMENT.actionList;

        public ActionListHandler(List<MutableAction> list, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(list, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) {
            if (element.equals(ActionHandler.EL)) {
                MutableAction mutableAction = new MutableAction();
                ((List) getInstance()).add(mutableAction);
                new ActionHandler(mutableAction, this);
            }
        }
    }

    public static class AllowedValueListHandler extends ServiceDescriptorHandler<List<String>> {
        public static final Descriptor.Service.ELEMENT EL = Descriptor.Service.ELEMENT.allowedValueList;

        public AllowedValueListHandler(List<String> list, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(list, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void endElement(Descriptor.Service.ELEMENT element) {
            if (AnonymousClass1.$SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[element.ordinal()] != 7) {
                return;
            }
            ((List) getInstance()).add(getCharacters());
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(EL);
        }
    }

    public static class AllowedValueRangeHandler extends ServiceDescriptorHandler<MutableAllowedValueRange> {
        public static final Descriptor.Service.ELEMENT EL = Descriptor.Service.ELEMENT.allowedValueRange;

        public AllowedValueRangeHandler(MutableAllowedValueRange mutableAllowedValueRange, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(mutableAllowedValueRange, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void endElement(Descriptor.Service.ELEMENT element) {
            try {
                switch (AnonymousClass1.$SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[element.ordinal()]) {
                    case 8:
                        ((MutableAllowedValueRange) getInstance()).minimum = Long.valueOf(getCharacters());
                        break;
                    case 9:
                        ((MutableAllowedValueRange) getInstance()).maximum = Long.valueOf(getCharacters());
                        break;
                    case 10:
                        ((MutableAllowedValueRange) getInstance()).step = Long.valueOf(getCharacters());
                        break;
                }
            } catch (Exception unused) {
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(EL);
        }
    }

    public static class RootHandler extends ServiceDescriptorHandler<MutableService> {
        public RootHandler(MutableService mutableService, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
            super(mutableService, o00000OOoOOO00O00o0ooooooooO000ooooO0000);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) {
            if (element.equals(ActionListHandler.EL)) {
                ArrayList arrayList = new ArrayList();
                ((MutableService) getInstance()).actions = arrayList;
                new ActionListHandler(arrayList, this);
            }
            if (element.equals(StateVariableListHandler.EL)) {
                ArrayList arrayList2 = new ArrayList();
                ((MutableService) getInstance()).stateVariables = arrayList2;
                new StateVariableListHandler(arrayList2, this);
            }
        }
    }

    public static class ServiceDescriptorHandler<I> extends O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {
        public ServiceDescriptorHandler(I i) {
            super(i, null, null);
        }

        public void endElement(Descriptor.Service.ELEMENT element) {
        }

        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return false;
        }

        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) {
        }

        public ServiceDescriptorHandler(I i, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
            super(i, o00000OOoOOO00O00o0ooooooooO000ooooO0000, null);
        }

        @Override // org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            super.endElement(str, str2, str3);
            Descriptor.Service.ELEMENT elementValueOrNullOf = Descriptor.Service.ELEMENT.valueOrNullOf(str2);
            if (elementValueOrNullOf == null) {
                return;
            }
            endElement(elementValueOrNullOf);
        }

        @Override // org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
        public boolean isLastElement(String str, String str2, String str3) {
            Descriptor.Service.ELEMENT elementValueOrNullOf = Descriptor.Service.ELEMENT.valueOrNullOf(str2);
            return elementValueOrNullOf != null && isLastElement(elementValueOrNullOf);
        }

        @Override // org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            super.startElement(str, str2, str3, attributes);
            Descriptor.Service.ELEMENT elementValueOrNullOf = Descriptor.Service.ELEMENT.valueOrNullOf(str2);
            if (elementValueOrNullOf == null) {
                return;
            }
            startElement(elementValueOrNullOf, attributes);
        }

        public ServiceDescriptorHandler(I i, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(i, serviceDescriptorHandler);
        }

        public ServiceDescriptorHandler(I i, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(i, o00000OOoOOO00O00o0ooooooooO000ooooO0000, serviceDescriptorHandler);
        }
    }

    public static class StateVariableHandler extends ServiceDescriptorHandler<MutableStateVariable> {
        public static final Descriptor.Service.ELEMENT EL = Descriptor.Service.ELEMENT.stateVariable;

        public StateVariableHandler(MutableStateVariable mutableStateVariable, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(mutableStateVariable, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void endElement(Descriptor.Service.ELEMENT element) {
            int i = AnonymousClass1.$SwitchMap$org$fourthline$cling$binding$xml$Descriptor$Service$ELEMENT[element.ordinal()];
            if (i == 1) {
                ((MutableStateVariable) getInstance()).name = getCharacters();
                return;
            }
            if (i != 5) {
                if (i != 6) {
                    return;
                }
                ((MutableStateVariable) getInstance()).defaultValue = getCharacters();
            } else {
                String characters = getCharacters();
                Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(characters);
                ((MutableStateVariable) getInstance()).dataType = byDescriptorName != null ? byDescriptorName.getDatatype() : new CustomDatatype(characters);
            }
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) {
            if (element.equals(AllowedValueListHandler.EL)) {
                ArrayList arrayList = new ArrayList();
                ((MutableStateVariable) getInstance()).allowedValues = arrayList;
                new AllowedValueListHandler(arrayList, this);
            }
            if (element.equals(AllowedValueRangeHandler.EL)) {
                MutableAllowedValueRange mutableAllowedValueRange = new MutableAllowedValueRange();
                ((MutableStateVariable) getInstance()).allowedValueRange = mutableAllowedValueRange;
                new AllowedValueRangeHandler(mutableAllowedValueRange, this);
            }
        }
    }

    public static class StateVariableListHandler extends ServiceDescriptorHandler<List<MutableStateVariable>> {
        public static final Descriptor.Service.ELEMENT EL = Descriptor.Service.ELEMENT.serviceStateTable;

        public StateVariableListHandler(List<MutableStateVariable> list, ServiceDescriptorHandler serviceDescriptorHandler) {
            super(list, serviceDescriptorHandler);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public boolean isLastElement(Descriptor.Service.ELEMENT element) {
            return element.equals(EL);
        }

        @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderSAXImpl.ServiceDescriptorHandler
        public void startElement(Descriptor.Service.ELEMENT element, Attributes attributes) {
            if (element.equals(StateVariableHandler.EL)) {
                MutableStateVariable mutableStateVariable = new MutableStateVariable();
                String value = attributes.getValue(Descriptor.Service.ATTRIBUTE.sendEvents.toString());
                mutableStateVariable.eventDetails = new StateVariableEventDetails(value != null && value.toUpperCase(Locale.ROOT).equals("YES"));
                ((List) getInstance()).add(mutableStateVariable);
                new StateVariableHandler(mutableStateVariable, this);
            }
        }
    }

    @Override // org.fourthline.cling.binding.xml.UDA10ServiceDescriptorBinderImpl, org.fourthline.cling.binding.xml.ServiceDescriptorBinder
    public <S extends Service> S describe(S s, String str) throws ValidationException, DescriptorBindingException {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            log.fine("Reading service from XML descriptor");
            O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = new O00000OOoOOO00O00o0ooooooooO000ooooO0000();
            MutableService mutableService = new MutableService();
            hydrateBasic(mutableService, s);
            new RootHandler(mutableService, o00000OOoOOO00O00o0ooooooooO000ooooO0000);
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.parse(new InputSource(new StringReader(str.trim())));
            return (S) mutableService.build(s.getDevice());
        } catch (ValidationException e) {
            throw e;
        } catch (Exception e2) {
            throw new DescriptorBindingException("Could not parse service descriptor: " + e2.toString(), e2);
        }
    }
}
