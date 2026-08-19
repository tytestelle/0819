package org.fourthline.cling.registry.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface After {
}
