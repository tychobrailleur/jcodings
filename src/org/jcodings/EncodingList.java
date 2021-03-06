/*
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.jcodings;

final class EncodingList {
    static final String[][] LIST = new String[][] {
        {"A", "BINARY", "ASCII-8BIT"},
        {"R", "IBM437", "ASCII-8BIT"},
        {"A", "CP437", "IBM437"},
        {"R", "IBM737", "ASCII-8BIT"},
        {"A", "CP737", "IBM737"},
        {"R", "IBM775", "ASCII-8BIT"},
        {"A", "CP775", "IBM775"},
        {"R", "CP850", "ASCII-8BIT"},
        {"A", "IBM850", "CP850"},
        {"R", "IBM852", "ASCII-8BIT"},
        {"R", "CP852", "IBM852"},
        {"R", "IBM855", "ASCII-8BIT"},
        {"R", "CP855", "IBM855"},
        {"R", "IBM857", "ASCII-8BIT"},
        {"A", "CP857", "IBM857"},
        {"R", "IBM860", "ASCII-8BIT"},
        {"A", "CP860", "IBM860"},
        {"R", "IBM861", "ASCII-8BIT"},
        {"A", "CP861", "IBM861"},
        {"R", "IBM862", "ASCII-8BIT"},
        {"A", "CP862", "IBM862"},
        {"R", "IBM863", "ASCII-8BIT"},
        {"A", "CP863", "IBM863"},
        {"R", "IBM864", "ASCII-8BIT"},
        {"A", "CP864", "IBM864"},
        {"R", "IBM865", "ASCII-8BIT"},
        {"A", "CP865", "IBM865"},
        {"R", "IBM866", "ASCII-8BIT"},
        {"A", "CP866", "IBM866"},
        {"R", "IBM869", "ASCII-8BIT"},
        {"A", "CP869", "IBM869"},
        {"R", "Windows-1258", "ASCII-8BIT"},
        {"A", "CP1258", "Windows-1258"},
        {"R", "GB1988", "ASCII-8BIT"},
        {"R", "macCentEuro", "ASCII-8BIT"},
        {"R", "macCroatian", "ASCII-8BIT"},
        {"R", "macCyrillic", "ASCII-8BIT"},
        {"R", "macGreek", "ASCII-8BIT"},
        {"R", "macIceland", "ASCII-8BIT"},
        {"R", "macRoman", "ASCII-8BIT"},
        {"R", "macRomania", "ASCII-8BIT"},
        {"R", "macThai", "ASCII-8BIT"},
        {"R", "macTurkish", "ASCII-8BIT"},
        {"R", "macUkraine", "ASCII-8BIT"},
        {"R", "CP950", "Big5"},
        {"S", "Big5-HKSCS", "Big5"},
        {"A", "Big5-HKSCS:2008", "Big5-HKSCS"},
        {"R", "CP951", "Big5-HKSCS"},
        {"S", "Big5-UAO", "Big5"},
        {"R", "stateless-ISO-2022-JP", "Emacs-Mule"},
        {"A", "eucJP", "EUC-JP" /* UI-OSF Application Platform Profile for Japanese Environment Version 1.1 */},
        {"R", "eucJP-ms", "EUC-JP" /* TOG/JVC CDE/Motif Technical WG */},
        {"A", "euc-jp-ms", "eucJP-ms"},
        {"R", "CP51932", "EUC-JP"},
        {"A", "eucKR", "EUC-KR"},
        {"A", "eucTW", "EUC-TW"},
        {"A", "EUC-CN", "GB2312"},
        {"A", "eucCN", "GB2312"},
        {"R", "GB12345", "GB2312"},
        {"A", "CP936", "GBK"},
        {"D", "ISO-2022-JP"},
        {"A", "ISO2022-JP", "ISO-2022-JP"},
        {"R", "ISO-2022-JP-2", "ISO-2022-JP"},
        {"A", "ISO2022-JP2", "ISO-2022-JP-2"},
        {"R", "CP50220", "ISO-2022-JP"},
        {"R", "CP50221", "ISO-2022-JP"},
        {"A", "ISO8859-1", "ISO-8859-1"},
        {"R", "Windows-1252", "ISO-8859-1"},
        {"A", "CP1252", "Windows-1252"},
        {"A", "ISO8859-2", "ISO-8859-2"},
        {"R", "Windows-1250", "ISO-8859-2"},
        {"A", "CP1250", "Windows-1250"},
        {"A", "ISO8859-3", "ISO-8859-3"},
        {"A", "ISO8859-4", "ISO-8859-4"},
        {"A", "ISO8859-5", "ISO-8859-5"},
        {"A", "ISO8859-6", "ISO-8859-6"},
        {"R", "Windows-1256", "ISO-8859-6"},
        {"A", "CP1256", "Windows-1256"},
        {"A", "ISO8859-7", "ISO-8859-7"},
        {"R", "Windows-1253", "ISO-8859-7"},
        {"A", "CP1253", "Windows-1253"},
        {"A", "ISO8859-8", "ISO-8859-8"},
        {"R", "Windows-1255", "ISO-8859-8"},
        {"A", "CP1255", "Windows-1255"},
        {"A", "ISO8859-9", "ISO-8859-9"},
        {"R", "Windows-1254", "ISO-8859-9"},
        {"A", "CP1254", "Windows-1254"},
        {"A", "ISO8859-10", "ISO-8859-10"},
        {"A", "ISO8859-11", "ISO-8859-11"},
        {"R", "TIS-620", "ISO-8859-11"},
        {"R", "Windows-874", "ISO-8859-11"},
        {"A", "CP874", "Windows-874"},
        {"A", "ISO8859-13", "ISO-8859-13"},
        {"R", "Windows-1257", "ISO-8859-13"},
        {"A", "CP1257", "Windows-1257"},
        {"A", "ISO8859-14", "ISO-8859-14"},
        {"A", "ISO8859-15", "ISO-8859-15"},
        {"A", "ISO8859-16", "ISO-8859-16"},
        {"A", "CP878", "KOI8-R"},
        {"R", "Windows-31J", "Shift_JIS"},
        {"A", "CP932", "Windows-31J"},
        {"A", "csWindows31J", "Windows-31J" /* IANA.  IE6 don't accept Windows-31J but csWindows31J. */},
        {"A", "SJIS", "Windows-31J"},
        {"A", "PCK", "Windows-31J"},
        {"R", "MacJapanese", "Shift_JIS"},
        {"A", "MacJapan", "MacJapanese"},
        {"A", "ASCII", "US-ASCII"},
        {"A", "ANSI_X3.4-1968", "US-ASCII"},
        {"A", "646", "US-ASCII"},
        {"D", "UTF-7"},
        {"A", "CP65000", "UTF-7"},
        {"A", "CP65001", "UTF-8"},
        {"R", "UTF8-MAC", "UTF-8"},
        {"A", "UTF-8-MAC", "UTF8-MAC"},
        {"A", "UTF-8-HFS", "UTF8-MAC" /* Emacs 23.2 */},
        {"D", "UTF-16"},
        {"D", "UTF-32"},
        {"A", "UCS-2BE", "UTF-16BE"},
        {"A", "UCS-4BE", "UTF-32BE"},
        {"A", "UCS-4LE", "UTF-32LE"},
        {"A", "CP1251", "Windows-1251"},
        {"R", "UTF8-DoCoMo", "UTF-8"},
        {"R", "SJIS-DoCoMo", "Windows-31J"},
        {"R", "UTF8-KDDI", "UTF-8"},
        {"R", "SJIS-KDDI", "Windows-31J"},
        {"R", "ISO-2022-JP-KDDI", "ISO-2022-JP"},
        {"R", "stateless-ISO-2022-JP-KDDI", "stateless-ISO-2022-JP"},
        {"R", "UTF8-SoftBank", "UTF-8"},
        {"R", "SJIS-SoftBank", "Windows-31J"}
    };
}