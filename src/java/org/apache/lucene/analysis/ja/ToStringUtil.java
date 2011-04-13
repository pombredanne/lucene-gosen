package org.apache.lucene.analysis.ja;

/**
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.HashMap;

public class ToStringUtil {
  // a translation map for parts of speech, only used for reflectWith
  private static final HashMap<String,String> posTranslations = new HashMap<String,String>();
  static {
    posTranslations.put("名詞", "noun");
    posTranslations.put("名詞-一般", "noun-common");
    posTranslations.put("名詞-固有名詞", "noun-proper");
    posTranslations.put("名詞-固有名詞-一般", "noun-proper-misc");
    posTranslations.put("名詞-固有名詞-人名", "noun-proper-person");
    posTranslations.put("名詞-固有名詞-人名-一般", "noun-proper-person-misc");
    posTranslations.put("名詞-固有名詞-人名-姓", "noun-proper-person-surname");
    posTranslations.put("名詞-固有名詞-人名-名", "noun-proper-person-given_name");
    posTranslations.put("名詞-固有名詞-組織", "noun-proper-organization");
    posTranslations.put("名詞-固有名詞-地域", "noun-proper-place");
    posTranslations.put("名詞-固有名詞-地域-一般", "noun-proper-place-misc");
    posTranslations.put("名詞-固有名詞-地域-国", "noun-proper-place-country");
    posTranslations.put("名詞-代名詞", "noun-pronoun");
    posTranslations.put("名詞-代名詞-一般", "noun-pronoun-misc");
    posTranslations.put("名詞-代名詞-縮約", "noun-pronoun-contraction");
    posTranslations.put("名詞-副詞可能", "noun-adverbial");
    posTranslations.put("名詞-サ変接続", "noun-verbal");
    posTranslations.put("名詞-形容動詞語幹", "noun-adjective-base");
    posTranslations.put("名詞-数", "noun-numeric");
    posTranslations.put("名詞-非自立", "noun-affix");
    posTranslations.put("名詞-非自立-一般", "noun-affix-misc");
    posTranslations.put("名詞-非自立-副詞可能", "noun-affix-adverbial");
    posTranslations.put("名詞-非自立-助動詞語幹", "noun-affix-aux");
    posTranslations.put("名詞-非自立-形容動詞語幹", "noun-affix-adjective-base");
    posTranslations.put("名詞-特殊", "noun-special");
    posTranslations.put("名詞-特殊-助動詞語幹", "noun-special-aux");
    posTranslations.put("名詞-接尾", "noun-suffix");
    posTranslations.put("名詞-接尾-一般", "noun-suffix-misc");
    posTranslations.put("名詞-接尾-人名", "noun-suffix-person");
    posTranslations.put("名詞-接尾-地域", "noun-suffix-place");
    posTranslations.put("名詞-接尾-サ変接続", "noun-suffix-verbal");
    posTranslations.put("名詞-接尾-助動詞語幹", "noun-suffix-aux");
    posTranslations.put("名詞-接尾-形容動詞語幹", "noun-suffix-adjective-base");
    posTranslations.put("名詞-接尾-副詞可能", "noun-suffix-adverbial");
    posTranslations.put("名詞-接尾-助数詞", "noun-suffix-classifier");
    posTranslations.put("名詞-接尾-特殊", "noun-suffix-special");
    posTranslations.put("名詞-接続詞的", "noun-suffix-conjunctive");
    posTranslations.put("名詞-動詞非自立的", "noun-verbal_aux");
    posTranslations.put("名詞-引用文字列", "noun-quotation");
    posTranslations.put("名詞-ナイ形容詞語幹", "noun-nai_adjective");
    posTranslations.put("接頭詞", "prefix");
    posTranslations.put("接頭詞-名詞接続", "prefix-nominal");
    posTranslations.put("接頭詞-動詞接続", "prefix-verbal");
    posTranslations.put("接頭詞-形容詞接続", "prefix-adjectival");
    posTranslations.put("接頭詞-数接続", "prefix-numerical");
    posTranslations.put("動詞", "verb");
    posTranslations.put("動詞-自立", "verb-main");
    posTranslations.put("動詞-非自立", "verb-auxiliary");
    posTranslations.put("動詞-接尾", "verb-suffix");
    posTranslations.put("形容詞", "adjective");
    posTranslations.put("形容詞-自立", "adjective-main");
    posTranslations.put("形容詞-非自立", "adjective-auxiliary");
    posTranslations.put("形容詞-接尾", "adjective-suffix");
    posTranslations.put("副詞", "adverb");
    posTranslations.put("副詞-一般", "adverb-misc");
    posTranslations.put("副詞-助詞類接続", "adverb-particle_conjunction");
    posTranslations.put("連体詞", "adnominal");
    posTranslations.put("接続詞", "conjunction");
    posTranslations.put("助詞", "particle");
    posTranslations.put("助詞-格助詞", "particle-case");
    posTranslations.put("助詞-格助詞-一般", "particle-case-misc");
    posTranslations.put("助詞-格助詞-引用", "particle-case-quote");
    posTranslations.put("助詞-格助詞-連語", "particle-case-compound");
    posTranslations.put("助詞-接続助詞", "particle-conjunctive");
    posTranslations.put("助詞-係助詞", "particle-dependency");
    posTranslations.put("助詞-副助詞", "particle-adverbial");
    posTranslations.put("助詞-間投助詞", "particle-interjective");
    posTranslations.put("助詞-並立助詞", "particle-coordinate");
    posTranslations.put("助詞-終助詞", "particle-final");
    posTranslations.put("助詞-副助詞／並立助詞／終助詞", "particle-adverbial/conjunctive/final");
    posTranslations.put("助詞-連体化", "particle-adnominalizer (no)");
    posTranslations.put("助詞-副詞化", "particle-adnominalizer (ni/to)");
    posTranslations.put("助詞-特殊", "particle-special");
    posTranslations.put("助動詞", "auxiliary-verb");
    posTranslations.put("感動詞", "interjection");
    posTranslations.put("記号", "symbol");
    posTranslations.put("記号-一般", "symbol-misc");
    posTranslations.put("記号-句点", "symbol-comma");
    posTranslations.put("記号-読点", "symbol-period");
    posTranslations.put("記号-空白", "symbol-space");
    posTranslations.put("記号-括弧開", "symbol-open_bracket");
    posTranslations.put("記号-括弧閉", "symbol-close_bracket");
    posTranslations.put("記号-アルファベット", "symbol-alphabetic");
    posTranslations.put("その他", "other");
    posTranslations.put("その他-間投", "other-interjection");
    posTranslations.put("フィラー", "filler");
    posTranslations.put("非言語音", "non-verbal");
    posTranslations.put("語断片", "fragment");
    posTranslations.put("未知語", "unknown");
  }
  
  /**
   * Get the english form of a POS tag
   */
  public static String getPOSTranslation(String s) {
    return posTranslations.get(s);
  }
  
  /**
   * Romanize katakana with modified hepburn
   */
  public static String getRomanization(String s) {
    StringBuilder builder = new StringBuilder();
    final int len = s.length();
    for (int i = 0; i < len; i++) {
      // maximum lookahead: 3
      char ch = s.charAt(i);
      char ch2 = (i < len - 1) ? s.charAt(i + 1) : 0;
      char ch3 = (i < len - 2) ? s.charAt(i + 2) : 0;
      
      main: switch (ch) {
        case 'ッ':
          switch (ch2) {
            case 'カ':
            case 'キ':
            case 'ク':
            case 'ケ':
            case 'コ':
              builder.append('k');
              break main;
            case 'サ':
            case 'シ':
            case 'ス':
            case 'セ':
            case 'ソ':
              builder.append('s');
              break main;
            case 'タ':
            case 'チ':
            case 'ツ':
            case 'テ':
            case 'ト':
              builder.append('t');
              break main;
            case 'パ':
            case 'ピ':
            case 'プ':
            case 'ペ':
            case 'ポ':
              builder.append('p');
              break main;
          }
          break;
        case 'ア':
          builder.append('a');
          break;
        case 'イ':
          builder.append('i');
          break;
        case 'ウ':
          builder.append('u');
          break;
        case 'エ':
          builder.append('e');
          break;
        case 'オ':
          if (ch2 == 'ウ') {
            builder.append('ō');
            i++;
          } else {
            builder.append('o');
          }
          break;
        case 'カ':
          builder.append("ka");
          break;
        case 'キ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("kyō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("kyū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("kya");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("kyo");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("kyu");
            i++;
          } else {
            builder.append("ki");
          }
          break;
        case 'ク':
          builder.append("ku");
          break;
        case 'ケ':
          builder.append("ke");
          break;
        case 'コ':
          if (ch2 == 'ウ') {
            builder.append("kō");
            i++;
          } else {
            builder.append("ko");
          }
          break;
        case 'サ':
          builder.append("sa");
          break;
        case 'シ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("shō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("shū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("sha");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("sho");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("shu");
            i++;
          } else {
            builder.append("shi");
          }
          break;
        case 'ス':
          builder.append("su");
          break;
        case 'セ':
          builder.append("se");
          break;
        case 'ソ':
          if (ch2 == 'ウ') {
            builder.append("sō");
            i++;
          } else {
            builder.append("so");
          }
          break;
        case 'タ':
          builder.append("ta");
          break;
        case 'チ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("chō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("chū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("cha");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("cho");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("chu");
            i++;
          } else {
            builder.append("chi");
          }
          break;
        case 'ツ':
          builder.append("tsu");
          break;
        case 'テ':
          builder.append("te");
          break;
        case 'ト':
          if (ch2 == 'ウ') {
            builder.append("tō");
            i++;
          } else {
            builder.append("to");
          }
          break;
        case 'ナ':
          builder.append("na");
          break;
        case 'ニ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("nyō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("nyū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("nya");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("nyo");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("nyu");
            i++;
          } else {
            builder.append("ni");
          }
          break;
        case 'ヌ':
          builder.append("nu");
          break;
        case 'ネ':
          builder.append("ne");
          break;
        case 'ノ':
          if (ch2 == 'ウ') {
            builder.append("nō");
            i++;
          } else {
            builder.append("no");
          }
          break;
        case 'ハ':
          builder.append("ha");
          break;
        case 'ヒ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("hyō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("hyū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("hya");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("hyo");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("hyu");
            i++;
          } else {
            builder.append("hi");
          }
          break;
        case 'フ':
          builder.append("fu");
          break;
        case 'ヘ':
          builder.append("he");
          break;
        case 'ホ':
          if (ch2 == 'ウ') {
            builder.append("hō");
            i++;
          } else {
            builder.append("ho");
          }
          break;
        case 'マ':
          builder.append("ma");
          break;
        case 'ミ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("myō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("myū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("mya");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("myo");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("myu");
            i++;
          } else {
            builder.append("mi");
          }
          break;
        case 'ム':
          builder.append("mu");
          break;
        case 'メ':
          builder.append("mi");
          break;
        case 'モ':
          if (ch2 == 'ウ') {
            builder.append("mō");
            i++;
          } else {
            builder.append("mo");
          }
          break;
        case 'ヤ':
          builder.append("ya");
          break;
        case 'ユ':
          builder.append("yu");
          break;
        case 'ヨ':
          if (ch2 == 'ウ') {
            builder.append("yō");
            i++;
          } else {
            builder.append("yo");
          }
          break;
        case 'ラ':
          builder.append("ra");
          break;
        case 'リ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("ryō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("ryū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("rya");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("ryo");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("ryu");
            i++;
          } else {
            builder.append("ri");
          }
          break;
        case 'ル':
          builder.append("ru");
          break;
        case 'レ':
          builder.append("re");
          break;
        case 'ロ':
          if (ch2 == 'ウ') {
            builder.append("rō");
            i++;
          } else {
            builder.append("ro");
          }
          break;
        case 'ワ':
          builder.append("wa");
          break;
        case 'ヰ':
          builder.append("i");
          break;
        case 'ヱ':
          builder.append("e");
          break;
        case 'ヲ':
          builder.append("o");
          break;
        case 'ン':
          switch (ch2) {
            case 'バ':
            case 'ビ':
            case 'ブ':
            case 'ベ':
            case 'ボ':
            case 'パ':
            case 'ピ':
            case 'プ':
            case 'ペ':
            case 'ポ':
            case 'マ':
            case 'ミ':
            case 'ム':
            case 'メ':
            case 'モ':
              builder.append('m');
              break main;
            case 'ヤ':
            case 'ユ':
            case 'ヨ':
            case 'ア':
            case 'イ':
            case 'ウ':
            case 'エ':
            case 'オ':
              builder.append("n'");
              break main;
            default:
              builder.append("n");
              break main;
          }
        case 'ガ':
          builder.append("ga");
          break;
        case 'ギ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("gyō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("gyū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("gya");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("gyo");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("gyu");
            i++;
          } else {
            builder.append("gi");
          }
          break;
        case 'グ':
          builder.append("gu");
          break;
        case 'ゲ':
          builder.append("ge");
          break;
        case 'ゴ':
          if (ch2 == 'ウ') {
            builder.append("gō");
            i++;
          } else {
            builder.append("go");
          }
          break;
        case 'ザ':
          builder.append("za");
          break;
        case 'ジ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("jō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("jū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("ja");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("jo");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("ju");
            i++;
          } else {
            builder.append("ji");
          }
          break;
        case 'ズ':
          builder.append("zu");
          break;
        case 'ゼ':
          builder.append("ze");
          break;
        case 'ゾ':
          if (ch2 == 'ウ') {
            builder.append("zō");
            i++;
          } else {
            builder.append("zo");
          }
          break;
        case 'ダ':
          builder.append("da");
          break;
        case 'ヂ':
          builder.append("ji");
          break;
        case 'ヅ':
          builder.append("zu");
          break;
        case 'デ':
          builder.append("de");
          break;
        case 'ド':
          if (ch2 == 'ウ') {
            builder.append("dō");
            i++;
          } else {
            builder.append("do");
          }
          break;
        case 'バ':
          builder.append("ba");
          break;
        case 'ビ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("byō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("byū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("bya");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("byo");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("byu");
            i++;
          } else {
            builder.append("bi");
          }
          break;
        case 'ブ':
          builder.append("bu");
          break;
        case 'ベ':
          builder.append("be");
          break;
        case 'ボ':
          if (ch2 == 'ウ') {
            builder.append("bō");
            i++;
          } else {
            builder.append("bo");
          }
          break;
        case 'パ':
          builder.append("pa");
          break;
        case 'ピ':
          if (ch2 == 'ョ' && ch3 == 'ウ') {
            builder.append("pyō");
            i += 2;
          } else if (ch2 == 'ュ' && ch3 == 'ウ') {
            builder.append("pyū");
            i += 2;
          } else if (ch2 == 'ャ') {
            builder.append("pya");
            i++;
          } else if (ch2 == 'ョ') {
            builder.append("pyo");
            i++;
          } else if (ch2 == 'ュ') {
            builder.append("pyu");
            i++;
          } else {
            builder.append("pi");
          }
          break;
        case 'プ':
          builder.append("pu");
          break;
        case 'ペ':
          builder.append("pe");
          break;
        case 'ポ':
          if (ch2 == 'ウ') {
            builder.append("pō");
            i++;
          } else {
            builder.append("po");
          }
          break;
        case 'ヴ':
          builder.append("v");
          break;
        case 'ー':
          break;
        default:
          builder.append(ch);
      }
    }
    return builder.toString();
  }
}