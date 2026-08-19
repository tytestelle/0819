package com.google.zxing.datamatrix.encoder;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.tencent.smtt.sdk.TbsListener;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorCorrection {
    private static final int MODULO_VALUE = 301;
    private static final int[] FACTOR_SETS = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] FACTORS = {new int[]{TbsListener.ErrorCode.INCR_ERROR_DETAIL, 48, 15, 111, 62}, new int[]{23, 68, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 248, 116, 255, 110, 61}, new int[]{175, 138, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, 158, 91, 61, 42, 142, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 97, TbsListener.ErrorCode.APP_SET_MIN_CORE_VER, 100, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION}, new int[]{156, 97, PsExtractor.AUDIO_STREAM, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 109, 129, 94, 254, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 48, 90, 188}, new int[]{15, 195, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 9, TbsListener.ErrorCode.DECOUPLE_INSTLL_SUCCESS, 71, 168, 2, 188, 160, TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 109, 39, 176, 21, TbsListener.ErrorCode.NO_NEED_STARTDOWNLOAD, 197, 251, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, TbsListener.ErrorCode.NO_NEED_STARTDOWNLOAD, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, TbsListener.ErrorCode.RENAME_FAIL, 43, 97, 71, 96, 103, 174, 37, TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING, 170, 53, 75, 34, 249, 121, 17, 138, 110, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 141, TsExtractor.TS_STREAM_TYPE_DTS_HD, 120, TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING, TbsListener.ErrorCode.DECOUPLE_INSTLL_SUCCESS, 168, 93, 255}, new int[]{245, 127, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, 130, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 162, 181, 102, 120, 84, 179, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, 251, 80, 182, TbsListener.ErrorCode.INSTALL_FROM_UNZIP, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, 247, 105, 122, 2, 245, 133, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, 8, 175, 95, 100, 9, 167, 105, TbsListener.ErrorCode.COPY_TMPDIR_ERROR, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, TbsListener.ErrorCode.APK_PATH_ERROR, 69, 50, TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO, TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING, TbsListener.ErrorCode.DEXOAT_EXCEPTION, 5, 9, 5}, new int[]{245, TbsListener.ErrorCode.DOWNLOAD_CDN_URL_IS_NULL, 172, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 96, 32, 117, 22, TbsListener.ErrorCode.TPATCH_FAIL, 133, TbsListener.ErrorCode.TPATCH_FAIL, TbsListener.ErrorCode.RENAME_FAIL, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 188, TbsListener.ErrorCode.DECOUPLE_TPATCH_INSTALL_SUCCESS, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, TbsListener.ErrorCode.UNZIP_DIR_ERROR, TbsListener.ErrorCode.DOWNLOAD_USER_CANCEL, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 92, 253, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 19}, new int[]{175, 9, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, TbsListener.ErrorCode.TPATCH_FAIL, 12, 17, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM, 100, 29, 175, 170, TbsListener.ErrorCode.RENAME_SUCCESS, PsExtractor.AUDIO_STREAM, TbsListener.ErrorCode.COPY_EXCEPTION, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_FAIL, TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO, 159, 36, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 38, 200, TbsListener.ErrorCode.DOWNLOAD_CDN_URL_IS_NULL, 54, TbsListener.ErrorCode.INCR_ERROR_DETAIL, 146, TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS, 117, TbsListener.ErrorCode.APK_VERSION_ERROR, 29, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, TbsListener.ErrorCode.TPATCH_FAIL, 22, TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO, TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, 117, 62, TbsListener.ErrorCode.UNZIP_OTHER_ERROR, 164, 13, 137, 245, 127, 67, 247, 28, TbsListener.ErrorCode.NO_NEED_STARTDOWNLOAD, 43, TbsListener.ErrorCode.APK_VERSION_ERROR, 107, TbsListener.ErrorCode.DECOUPLE_INSTLL_SUCCESS, 53, 143, 46}, new int[]{TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, 93, 169, 50, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, TbsListener.ErrorCode.ROM_NOT_ENOUGH, 39, 118, TbsListener.ErrorCode.APK_PATH_ERROR, 188, TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, PsExtractor.PRIVATE_STREAM_1, 143, 108, 196, 37, 185, 112, 134, TbsListener.ErrorCode.RENAME_SUCCESS, 245, 63, 197, 190, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 106, 185, TbsListener.ErrorCode.INCRUPDATE_INSTALL_SUCCESS, 175, 64, 114, 71, 161, 44, 147, 6, 27, TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, 7, 94, 166, 224, 124, 86, 47, 11, TbsListener.ErrorCode.APK_INVALID}, new int[]{TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, TbsListener.ErrorCode.INCR_ERROR_DETAIL, 173, 89, 251, 149, 159, 56, 89, 33, 147, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, 36, 73, 127, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, TsExtractor.TS_STREAM_TYPE_DTS_HD, 248, 180, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS, 197, 158, TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING, 68, 122, 93, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 15, 160, TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, TbsListener.ErrorCode.TPATCH_INSTALL_SUCCESS, 66, TsExtractor.TS_STREAM_TYPE_DTS_UHD, TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, 185, TbsListener.ErrorCode.APK_PATH_ERROR, 167, 179, 25, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, 96, TbsListener.ErrorCode.ROM_NOT_ENOUGH, TbsListener.ErrorCode.RENAME_FAIL, TsExtractor.TS_STREAM_TYPE_DTS_HD, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, 181, TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID, 59, 52, 172, 25, 49, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, PsExtractor.PRIVATE_STREAM_1, 64, 54, 108, TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, TbsListener.ErrorCode.DOWNLOAD_CDN_URL_IS_NULL, 63, 96, 103, 82, 186}};
    private static final int[] LOG = new int[256];
    private static final int[] ALOG = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            ALOG[i2] = i;
            LOG[i] = i2;
            i *= 2;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    private ErrorCorrection() {
    }

    private static String createECCBlock(CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            int[] iArr = FACTOR_SETS;
            if (i4 >= iArr.length) {
                i4 = -1;
                break;
            }
            if (iArr[i4] == i) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Illegal number of error correction codewords specified: "));
        }
        int[] iArr2 = FACTORS[i4];
        char[] cArr = new char[i];
        for (int i5 = 0; i5 < i; i5++) {
            cArr[i5] = 0;
        }
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            int i7 = i - 1;
            int iCharAt = cArr[i7] ^ charSequence.charAt(i6);
            while (i7 > 0) {
                if (iCharAt == 0 || (i3 = iArr2[i7]) == 0) {
                    cArr[i7] = cArr[i7 - 1];
                } else {
                    char c = cArr[i7 - 1];
                    int[] iArr3 = ALOG;
                    int[] iArr4 = LOG;
                    cArr[i7] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i3]) % 255] ^ c);
                }
                i7--;
            }
            if (iCharAt == 0 || (i2 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = ALOG;
                int[] iArr6 = LOG;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i2]) % 255];
            }
        }
        char[] cArr2 = new char[i];
        for (int i8 = 0; i8 < i; i8++) {
            cArr2[i8] = cArr[(i - i8) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String encodeECC200(String str, SymbolInfo symbolInfo) {
        if (str.length() != symbolInfo.getDataCapacity()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(symbolInfo.getErrorCodewords() + symbolInfo.getDataCapacity());
        sb.append(str);
        int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
        if (interleavedBlockCount == 1) {
            sb.append(createECCBlock(str, symbolInfo.getErrorCodewords()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[interleavedBlockCount];
            int[] iArr2 = new int[interleavedBlockCount];
            int i = 0;
            while (i < interleavedBlockCount) {
                int i2 = i + 1;
                iArr[i] = symbolInfo.getDataLengthForInterleavedBlock(i2);
                iArr2[i] = symbolInfo.getErrorLengthForInterleavedBlock(i2);
                i = i2;
            }
            for (int i3 = 0; i3 < interleavedBlockCount; i3++) {
                StringBuilder sb2 = new StringBuilder(iArr[i3]);
                for (int i4 = i3; i4 < symbolInfo.getDataCapacity(); i4 += interleavedBlockCount) {
                    sb2.append(str.charAt(i4));
                }
                String strCreateECCBlock = createECCBlock(sb2.toString(), iArr2[i3]);
                int i5 = i3;
                int i6 = 0;
                while (i5 < iArr2[i3] * interleavedBlockCount) {
                    sb.setCharAt(symbolInfo.getDataCapacity() + i5, strCreateECCBlock.charAt(i6));
                    i5 += interleavedBlockCount;
                    i6++;
                }
            }
        }
        return sb.toString();
    }
}
