/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.intellij.clojure.parser;

import com.intellij.lang.Language;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.clojure.lang.ClojureScriptLanguage;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.intellij.clojure.psi.ClojureTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_ClojureLexer.flex</tt>
 */
public class _ClojureLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int SYMBOL0 = 2;
  public static final int SYMBOL1 = 4;
  public static final int SYMBOL2 = 6;
  public static final int DISPATCH = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 15136 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\6\15\1\16\23\15"+
    "\1\17\1\15\1\20\1\21\12\15\1\22\10\12\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\12\1\34\1\35\2\12\1\15\1\36\3\12\1\37\10\12\1\40\1\41\20\12\1\42"+
    "\2\12\1\43\4\12\1\44\1\45\1\46\3\12\1\47\1\50\1\51\3\12\51\15\1\52\3\15\1"+
    "\53\1\54\4\15\1\55\12\12\1\56\u02c1\12\1\57\277\12");

  /* The ZZ_CMAP_Y table has 3072 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\1\1\7\13\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\22\12\13"+
    "\1\24\1\13\1\25\1\24\1\13\1\26\1\24\1\13\1\27\1\30\1\13\1\31\1\32\1\1\1\31"+
    "\4\13\1\33\6\13\1\34\1\35\1\36\1\1\3\13\1\37\6\13\1\16\1\40\2\13\1\41\2\13"+
    "\1\42\1\1\1\13\1\43\4\1\1\13\1\44\2\1\1\45\7\13\1\46\1\24\1\34\1\47\1\35\1"+
    "\50\1\51\1\52\1\46\1\16\1\53\1\47\1\35\1\54\1\55\1\56\1\57\1\60\1\61\1\22"+
    "\1\35\1\62\1\63\1\64\1\46\1\65\1\66\1\47\1\35\1\62\1\67\1\70\1\46\1\71\1\72"+
    "\1\73\1\74\1\75\1\76\1\77\1\57\1\1\1\100\1\101\1\35\1\102\1\103\1\104\1\46"+
    "\1\1\1\105\1\101\1\35\1\106\1\103\1\107\1\46\1\110\1\105\1\101\1\13\1\37\1"+
    "\111\1\112\1\46\1\113\1\114\1\115\1\13\1\116\1\117\1\120\1\57\1\121\1\24\2"+
    "\13\1\31\1\122\1\123\2\1\1\124\1\125\1\126\1\127\1\130\1\131\2\1\1\64\1\132"+
    "\1\123\1\133\1\134\1\13\1\135\1\24\1\136\1\134\1\13\1\135\1\137\3\1\4\13\1"+
    "\123\4\13\1\140\2\13\1\141\2\13\1\142\24\13\1\143\1\144\2\13\1\143\2\13\1"+
    "\145\1\146\1\14\3\13\1\146\3\13\1\37\2\1\1\13\1\1\5\13\1\147\1\24\45\13\1"+
    "\150\1\13\1\151\1\31\4\13\1\152\1\153\1\154\1\44\1\13\1\44\1\13\1\155\1\154"+
    "\1\156\5\13\1\157\1\123\1\1\1\160\1\123\5\13\1\26\2\13\1\31\4\13\1\60\1\13"+
    "\1\122\2\43\1\57\1\13\1\42\1\44\2\13\1\43\1\13\1\161\1\123\2\1\1\13\1\43\3"+
    "\13\1\122\1\13\1\150\2\123\1\162\1\122\4\1\4\13\1\43\1\123\1\163\1\155\3\13"+
    "\1\40\3\13\1\155\3\13\1\26\1\164\1\40\1\13\1\42\5\1\1\165\1\13\1\166\17\13"+
    "\1\167\21\13\1\147\2\13\1\147\1\170\1\13\1\42\3\13\1\171\1\172\1\173\1\135"+
    "\1\172\1\174\1\1\1\175\1\176\1\64\1\177\1\1\1\200\1\1\1\135\3\1\2\13\1\64"+
    "\1\201\1\202\1\203\1\204\1\205\1\1\2\13\1\153\62\1\1\206\2\13\1\161\161\1"+
    "\2\13\1\122\2\13\1\122\10\13\1\207\1\155\2\13\1\141\3\13\1\210\1\176\1\13"+
    "\1\211\4\212\2\13\2\1\1\176\35\1\1\213\1\1\1\24\1\214\1\24\4\13\1\215\1\24"+
    "\4\13\1\142\1\216\1\13\1\42\1\24\4\13\1\122\1\1\1\13\1\31\3\1\1\13\40\1\133"+
    "\13\1\60\4\1\135\13\1\60\2\1\10\13\1\135\4\1\2\13\1\42\20\13\1\135\1\13\1"+
    "\217\1\1\3\13\1\220\7\13\1\16\1\1\1\221\1\222\5\13\1\223\1\13\1\42\1\26\3"+
    "\1\1\221\2\13\1\26\1\1\3\13\1\155\4\13\1\44\1\123\1\13\1\224\1\40\1\13\1\42"+
    "\2\13\1\155\1\13\1\135\4\13\1\225\1\123\1\13\1\226\3\13\1\211\1\42\1\123\1"+
    "\13\1\115\4\13\1\32\1\160\1\13\1\227\1\230\1\231\1\212\2\13\1\142\1\60\7\13"+
    "\1\232\1\123\72\13\1\155\1\13\1\233\2\13\1\43\20\1\26\13\1\42\6\13\1\161\2"+
    "\1\1\211\1\234\1\35\1\235\1\236\6\13\1\16\1\1\1\45\25\13\1\42\1\1\4\13\1\222"+
    "\2\13\1\26\2\1\1\43\1\13\1\1\1\13\1\237\1\240\2\1\1\136\7\13\1\135\1\1\1\123"+
    "\1\24\1\241\1\24\1\31\1\206\4\13\1\122\1\242\1\243\2\1\1\244\1\13\1\14\1\245"+
    "\2\42\2\1\7\13\1\31\4\1\3\13\1\44\7\1\1\246\10\1\1\13\1\135\3\13\2\64\1\1"+
    "\2\13\1\1\1\13\1\31\2\13\1\31\1\13\1\42\2\13\1\247\1\250\2\1\11\13\1\42\1"+
    "\123\5\1\2\13\1\26\3\13\1\155\11\1\23\13\1\211\1\13\1\60\1\26\11\1\1\251\2"+
    "\13\1\252\1\13\1\60\1\13\1\211\1\13\1\122\4\1\1\13\1\253\1\13\1\60\1\13\1"+
    "\161\4\1\3\13\1\254\4\1\1\255\1\256\1\13\1\257\2\1\1\13\1\135\1\13\1\135\2"+
    "\1\1\134\1\13\1\211\1\1\3\13\1\60\1\13\1\60\1\13\1\32\1\13\1\16\6\1\4\13\1"+
    "\153\3\1\3\13\1\32\3\13\1\32\60\1\4\13\1\211\1\1\1\57\1\176\3\13\1\31\1\1"+
    "\1\13\1\153\1\123\3\13\1\260\1\1\2\13\1\261\4\13\1\262\1\263\2\1\1\13\1\22"+
    "\1\13\1\26\4\1\1\264\1\27\1\153\3\13\1\31\1\123\1\34\1\47\1\35\1\62\1\67\1"+
    "\265\1\266\1\44\20\1\4\13\1\267\1\123\12\1\3\13\1\270\1\64\1\271\2\1\4\13"+
    "\1\272\1\123\2\1\3\13\1\26\1\123\3\1\1\13\1\102\1\43\1\123\26\1\4\13\1\123"+
    "\1\176\34\1\3\13\1\153\20\1\71\13\1\161\6\1\6\13\1\122\1\1\14\13\1\155\53"+
    "\1\2\13\1\122\75\1\44\13\1\211\33\1\43\13\1\153\1\13\1\122\1\123\6\1\1\13"+
    "\1\42\1\44\3\13\1\211\1\155\1\123\1\45\1\273\1\13\67\1\4\13\1\44\2\13\1\122"+
    "\1\176\1\13\6\1\1\16\77\1\6\13\1\31\1\135\1\153\1\274\114\1\1\275\1\276\1"+
    "\277\1\1\1\300\11\1\1\301\33\1\5\13\1\136\3\13\1\154\1\302\1\303\1\304\3\13"+
    "\1\305\1\306\1\13\1\307\1\310\1\101\24\13\1\270\1\13\1\101\1\142\1\13\1\142"+
    "\1\13\1\136\1\13\1\136\1\122\1\13\1\122\1\13\1\35\1\13\1\35\1\13\1\311\3\312"+
    "\40\1\3\13\1\233\2\13\1\135\1\313\1\314\1\163\1\24\25\1\14\13\1\44\1\211\122"+
    "\1\1\304\1\13\1\315\1\316\1\317\1\320\1\321\1\322\1\323\1\43\1\324\1\43\47"+
    "\1\1\13\1\161\1\13\1\161\1\13\1\161\47\1\55\13\1\211\2\1\103\13\1\44\15\13"+
    "\1\42\150\13\1\16\25\1\41\13\1\42\56\1\17\13\41\1");

  /* The ZZ_CMAP_A table has 3408 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\4\3\22\0\1\1\1\64\1\4\1\46\3\42\1\44\1\52\1\53\1\42\1\6\1\60\1\62"+
    "\1\10\1\20\1\13\11\7\1\45\1\2\1\65\1\63\1\42\1\66\1\51\4\43\1\11\1\43\6\17"+
    "\1\12\15\17\1\54\1\5\1\55\1\47\1\64\1\61\1\25\1\24\1\26\1\41\1\32\1\21\2\17"+
    "\1\36\1\17\1\27\1\35\1\40\1\22\1\37\1\31\1\17\1\16\1\30\1\33\1\23\1\17\1\34"+
    "\1\14\2\17\1\56\1\42\1\57\1\50\6\0\1\3\12\0\1\1\11\0\1\67\12\0\1\67\4\0\1"+
    "\67\5\0\27\67\1\0\12\67\4\0\14\67\16\0\5\67\7\0\1\67\1\0\1\67\1\0\5\67\1\0"+
    "\2\67\2\0\4\67\1\0\1\67\6\0\1\67\1\0\3\67\1\0\1\67\1\0\4\67\1\0\23\67\1\0"+
    "\11\67\1\0\26\67\2\0\1\67\6\0\10\67\10\0\16\67\1\0\1\67\1\0\2\67\1\0\2\67"+
    "\1\0\1\67\10\0\13\67\5\0\3\67\15\0\12\15\4\0\6\67\1\0\10\67\2\0\12\67\1\0"+
    "\6\67\12\15\3\67\2\0\14\67\2\0\3\67\12\15\14\67\4\0\1\67\5\0\16\67\2\0\14"+
    "\67\4\0\5\67\16\0\21\67\2\0\12\15\1\67\2\0\16\67\1\0\1\67\3\0\4\67\2\0\11"+
    "\67\2\0\2\67\2\0\4\67\10\0\1\67\4\0\2\67\1\0\1\67\1\0\3\67\1\0\6\67\4\0\2"+
    "\67\1\0\2\67\1\0\2\67\1\0\2\67\2\0\1\67\1\0\5\67\4\0\2\67\2\0\3\67\3\0\1\67"+
    "\7\0\4\67\1\0\1\67\7\0\12\15\6\67\13\0\3\67\1\0\11\67\1\0\2\67\1\0\2\67\1"+
    "\0\5\67\2\0\12\67\1\0\3\67\1\0\3\67\2\0\1\67\30\0\1\67\7\0\3\67\1\0\10\67"+
    "\2\0\6\67\2\0\2\67\2\0\3\67\10\0\2\67\4\0\2\67\1\0\1\67\1\0\1\67\20\0\2\67"+
    "\1\0\6\67\3\0\3\67\1\0\4\67\3\0\2\67\1\0\1\67\1\0\2\67\3\0\2\67\3\0\3\67\3"+
    "\0\14\67\4\0\5\67\3\0\3\67\1\0\4\67\2\0\1\67\6\0\1\67\10\0\4\67\1\0\10\67"+
    "\1\0\3\67\1\0\30\67\3\0\10\67\1\0\3\67\1\0\4\67\7\0\2\67\1\0\3\67\6\0\3\67"+
    "\1\0\10\67\1\0\6\67\1\0\5\67\2\0\4\67\5\0\2\67\7\0\1\67\2\0\2\67\15\0\5\67"+
    "\1\0\3\67\1\0\5\67\10\0\1\67\7\0\1\67\12\0\6\67\2\0\2\67\1\0\22\67\3\0\10"+
    "\67\1\0\11\67\1\0\1\67\2\0\7\67\3\0\1\67\4\0\6\67\1\0\1\67\1\0\10\67\2\0\2"+
    "\67\14\0\17\67\1\0\12\15\7\0\2\67\1\0\1\67\2\0\2\67\1\0\1\67\2\0\1\67\6\0"+
    "\4\67\1\0\7\67\1\0\3\67\1\0\1\67\1\0\1\67\2\0\2\67\1\0\15\67\1\0\3\67\2\0"+
    "\5\67\1\0\1\67\1\0\6\67\2\0\12\15\2\0\4\67\10\0\2\67\13\0\1\67\1\0\1\67\1"+
    "\0\1\67\4\0\12\67\1\0\24\67\3\0\5\67\1\0\12\67\6\0\1\67\11\0\12\15\4\67\2"+
    "\0\6\67\1\0\1\67\5\0\1\67\2\0\13\67\1\0\15\67\1\0\4\67\2\0\7\67\1\0\1\67\1"+
    "\0\4\67\2\0\1\67\1\0\4\67\2\0\7\67\1\0\1\67\1\0\4\67\2\0\16\67\2\0\6\67\2"+
    "\0\15\67\2\0\1\67\1\1\32\67\3\0\13\67\7\0\15\67\1\0\6\67\14\0\1\67\1\0\2\67"+
    "\14\0\4\67\3\0\1\67\4\0\2\67\15\0\3\67\2\0\12\67\15\0\1\67\23\0\5\67\12\15"+
    "\3\0\6\67\1\0\23\67\1\0\2\67\6\0\6\67\6\0\14\67\1\0\1\67\1\0\1\67\1\0\1\67"+
    "\1\0\6\67\1\0\7\67\1\0\1\67\3\0\3\67\1\0\7\67\3\0\4\67\2\0\6\67\4\0\13\1\15"+
    "\0\2\3\5\0\1\1\17\0\1\67\4\0\1\67\12\0\1\1\1\0\1\67\15\0\1\67\2\0\1\67\4\0"+
    "\1\67\2\0\12\67\1\0\1\67\3\0\5\67\6\0\1\67\1\0\1\67\1\0\1\67\1\0\4\67\1\0"+
    "\13\67\2\0\4\67\5\0\5\67\4\0\1\67\7\0\17\67\6\0\15\67\7\0\10\67\11\0\7\67"+
    "\1\0\7\67\1\0\1\1\4\0\3\67\11\0\5\67\2\0\5\67\3\0\7\67\2\0\2\67\2\0\3\67\5"+
    "\0\13\67\12\15\2\67\4\0\3\67\1\0\12\67\1\0\1\67\7\0\11\67\2\0\27\67\2\0\15"+
    "\67\3\0\1\67\1\0\1\67\2\0\1\67\16\0\1\67\12\15\5\67\3\0\5\67\12\0\6\67\2\0"+
    "\6\67\2\0\6\67\11\0\13\67\1\0\2\67\2\0\7\67\4\0\5\67\3\0\5\67\5\0\12\67\1"+
    "\0\5\67\1\0\1\67\1\0\2\67\1\0\2\67\1\0\12\67\3\0\2\67\30\0\16\67\4\0\1\67"+
    "\2\0\6\67\2\0\6\67\2\0\6\67\2\0\3\67\3\0\14\67\1\0\16\67\1\0\2\67\1\0\1\67"+
    "\15\0\1\67\2\0\4\67\4\0\10\67\1\0\5\67\12\0\6\67\2\0\1\67\1\0\14\67\1\0\2"+
    "\67\3\0\1\67\2\0\4\67\1\0\2\67\12\0\10\67\6\0\6\67\1\0\2\67\5\0\10\67\1\0"+
    "\3\67\1\0\13\67\4\0\3\67\4\0\6\67\1\0\12\15\4\67\2\0\1\67\11\0\5\67\5\0\3"+
    "\67\3\0\12\15\1\67\1\0\1\67\3\0\7\67\1\0\1\67\1\0\4\67\1\0\2\67\6\0\1\67\5"+
    "\0\7\67\2\0\7\67\3\0\6\67\1\0\1\67\10\0\6\67\2\0\10\67\10\0\6\67\2\0\1\67"+
    "\3\0\1\67\13\0\10\67\5\0\15\67\3\0\2\67\6\0\5\67\3\0\6\67\10\0\10\67\2\0\7"+
    "\67\16\0\4\67\4\0\3\67\15\0\1\67\2\0\2\67\2\0\4\67\1\0\14\67\1\0\1\67\1\0"+
    "\7\67\1\0\21\67\1\0\4\67\2\0\10\67\1\0\7\67\1\0\14\67\1\0\4\67\1\0\5\67\1"+
    "\0\1\67\3\0\11\67\1\0\10\67\2\0\22\15\5\0\1\67\16\0\1\67\14\0\2\67\1\0\1\67"+
    "\2\0\1\67\1\0\12\67\1\0\4\67\1\0\1\67\1\0\1\67\6\0\1\67\4\0\1\67\1\0\1\67"+
    "\1\0\1\67\1\0\3\67\1\0\2\67\1\0\1\67\2\0\1\67\1\0\1\67\1\0\1\67\1\0\1\67\1"+
    "\0\1\67\1\0\2\67\1\0\1\67\2\0\4\67\1\0\7\67\1\0\4\67\1\0\4\67\1\0\1\67\1\0"+
    "\12\67\1\0\5\67\1\0\3\67\1\0\5\67\1\0\5\67");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\5\1\6\1\7\3\5\1\10\1\1\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\5\1\25\1\26\1\27"+
    "\1\30\3\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\0\10\43\1\6\1\0\3\6"+
    "\1\0\1\6\2\0\1\44\1\5\1\44\1\0\1\30"+
    "\3\5\1\45\1\0\1\13\3\0\1\46\7\0\2\6"+
    "\1\5\1\6\2\5\1\6\1\0\1\6\1\47\1\50"+
    "\1\44\1\51\1\0\1\52\1\5\1\53\1\5\1\54"+
    "\1\5\1\0\1\31\7\0\2\6\1\5\1\6\1\47"+
    "\1\52\1\55\14\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[139];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\u0150\0\u0188"+
    "\0\u01c0\0\u01f8\0\u0230\0\u0268\0\u02a0\0\u02d8\0\u0310\0\u0348"+
    "\0\u0380\0\u03b8\0\u03f0\0\u0118\0\u0428\0\u0118\0\u0118\0\u0460"+
    "\0\u0118\0\u0118\0\u0118\0\u0118\0\u0118\0\u0118\0\u0118\0\u0118"+
    "\0\u0118\0\u0118\0\u0498\0\u04d0\0\u0118\0\u0118\0\u0118\0\u0508"+
    "\0\u0540\0\u0348\0\u0118\0\u0118\0\u0118\0\u0118\0\u0118\0\u0118"+
    "\0\u0118\0\u0578\0\u0118\0\u05b0\0\u0118\0\u05e8\0\u0620\0\u0658"+
    "\0\u0690\0\u06c8\0\u0700\0\u0738\0\u0770\0\u04d0\0\u07a8\0\u07e0"+
    "\0\u0818\0\u0850\0\u0118\0\u0888\0\u08c0\0\u0118\0\u08f8\0\u0930"+
    "\0\u0968\0\u0348\0\u09a0\0\u09d8\0\u0a10\0\u0118\0\u0a48\0\u0118"+
    "\0\u0a80\0\u0540\0\u0ab8\0\u0118\0\u0af0\0\u0b28\0\u0b60\0\u0b98"+
    "\0\u0bd0\0\u0c08\0\u0c40\0\u0c78\0\u0cb0\0\u0ce8\0\u0498\0\u0d20"+
    "\0\u0d58\0\u0d90\0\u0dc8\0\u0e00\0\u0888\0\u08c0\0\u0498\0\u0118"+
    "\0\u0e38\0\u0968\0\u0e70\0\u0498\0\u0ea8\0\u0118\0\u0a80\0\u0ee0"+
    "\0\u0ab8\0\u0f18\0\u0f50\0\u0f88\0\u0fc0\0\u0ff8\0\u1030\0\u1068"+
    "\0\u10a0\0\u10d8\0\u1110\0\u1148\0\u0d20\0\u0d58\0\u0498\0\u1180"+
    "\0\u11b8\0\u11f0\0\u1228\0\u1260\0\u1298\0\u12d0\0\u1308\0\u1340"+
    "\0\u0700\0\u1378\0\u13b0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[139];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\1\7\1\10\1\7\1\11\1\12\1\13\1\14"+
    "\1\15\2\16\1\17\1\16\1\6\2\16\1\20\1\21"+
    "\1\22\10\16\1\23\10\16\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\13\5\16\6\42\2\43\1\44\7\43"+
    "\1\42\24\43\1\42\1\43\13\42\6\43\10\42\1\45"+
    "\7\42\1\46\24\42\1\47\30\42\2\50\1\51\7\50"+
    "\1\52\24\50\1\47\1\50\13\42\6\50\1\53\1\54"+
    "\1\53\1\54\1\55\2\53\1\54\1\53\7\54\1\53"+
    "\21\54\1\53\1\54\1\56\2\53\1\57\2\53\1\55"+
    "\3\53\1\55\4\53\1\60\1\61\1\47\1\62\1\54"+
    "\71\0\1\7\1\0\1\7\64\0\3\10\1\0\64\10"+
    "\4\11\1\63\1\64\62\11\3\65\1\0\12\65\1\66"+
    "\2\65\1\67\1\70\1\71\1\72\3\65\1\73\2\65"+
    "\1\74\34\65\6\0\1\43\1\75\1\76\2\43\1\77"+
    "\4\43\1\0\24\43\1\0\1\43\13\0\6\43\7\0"+
    "\1\100\1\101\1\102\1\103\1\100\2\0\1\104\1\0"+
    "\1\105\11\0\1\102\43\0\2\106\1\107\7\106\1\0"+
    "\24\106\1\0\1\106\13\0\1\110\5\106\6\0\2\43"+
    "\1\76\7\43\1\0\24\43\1\0\1\43\13\0\6\43"+
    "\7\0\1\100\1\101\1\102\1\103\1\100\1\111\1\0"+
    "\1\104\1\0\1\105\11\0\1\102\43\0\37\112\1\0"+
    "\1\112\13\0\6\112\6\0\2\43\1\76\7\43\1\0"+
    "\4\43\1\113\17\43\1\0\1\43\13\0\6\43\6\0"+
    "\2\43\1\76\7\43\1\0\15\43\1\114\6\43\1\0"+
    "\1\43\13\0\6\43\6\0\2\43\1\76\5\43\1\115"+
    "\1\43\1\0\24\43\1\0\1\43\13\0\6\43\6\0"+
    "\37\116\1\117\1\116\13\0\6\116\51\0\1\120\24\0"+
    "\2\43\1\76\7\43\1\0\24\43\1\121\1\43\13\0"+
    "\6\43\6\0\2\43\1\0\7\43\1\0\24\43\1\0"+
    "\1\43\13\0\6\43\6\0\2\50\1\122\7\50\1\0"+
    "\24\50\1\123\1\50\13\0\6\50\6\0\2\50\1\0"+
    "\7\50\1\0\24\50\1\0\1\50\13\0\6\50\51\0"+
    "\1\124\16\0\3\11\1\0\64\11\32\0\1\125\74\0"+
    "\1\126\62\0\1\127\44\0\1\130\3\0\1\130\101\0"+
    "\1\131\73\0\1\132\63\0\1\133\50\0\1\43\1\134"+
    "\1\135\1\136\1\137\1\134\2\43\1\140\1\43\1\105"+
    "\11\43\1\136\12\43\1\121\1\43\13\0\6\43\6\0"+
    "\1\43\1\134\1\135\1\136\1\137\1\134\1\141\1\43"+
    "\1\140\1\43\1\105\11\43\1\136\12\43\1\121\1\43"+
    "\13\0\6\43\7\0\1\142\1\101\1\102\1\103\1\142"+
    "\2\0\1\104\1\0\1\105\11\0\1\102\44\0\1\101"+
    "\1\0\1\102\1\103\1\101\16\0\1\102\43\0\1\143"+
    "\1\144\3\0\1\144\46\0\1\143\14\0\1\145\1\0"+
    "\7\145\1\0\21\145\1\0\1\145\33\0\1\146\3\0"+
    "\1\146\62\0\2\147\1\76\7\147\1\0\24\147\1\0"+
    "\1\147\13\0\6\147\6\0\2\150\1\151\7\150\1\0"+
    "\24\150\1\0\1\150\13\0\6\150\7\0\1\152\1\0"+
    "\1\152\1\0\1\152\1\0\1\152\3\0\1\152\2\0"+
    "\3\152\3\0\1\152\6\0\1\152\1\0\1\152\32\0"+
    "\2\43\1\76\7\43\1\0\14\43\1\153\7\43\1\121"+
    "\1\43\13\0\6\43\6\0\2\43\1\76\7\43\1\0"+
    "\14\43\1\154\7\43\1\121\1\43\13\0\6\43\6\0"+
    "\2\43\1\76\7\43\1\0\2\43\1\155\21\43\1\121"+
    "\1\43\13\0\6\43\6\0\37\156\1\0\1\156\13\0"+
    "\6\156\6\0\2\157\1\160\7\157\1\0\24\157\1\0"+
    "\1\157\13\0\6\157\6\0\2\161\1\162\7\161\1\0"+
    "\24\161\1\0\1\161\13\0\6\161\33\0\1\163\52\0"+
    "\1\164\105\0\1\165\42\0\1\166\3\0\1\166\102\0"+
    "\1\167\66\0\1\170\66\0\1\65\51\0\1\43\1\171"+
    "\1\135\1\136\1\137\1\171\2\43\1\140\1\43\1\105"+
    "\11\43\1\136\12\43\1\121\1\43\13\0\6\43\6\0"+
    "\1\43\1\172\1\0\1\136\1\137\1\172\4\43\1\0"+
    "\11\43\1\136\12\43\1\0\1\43\13\0\6\43\6\0"+
    "\1\173\1\174\1\76\2\43\1\174\4\43\1\0\24\43"+
    "\1\121\1\43\13\0\1\173\5\43\6\0\1\43\1\175"+
    "\1\76\7\175\1\0\21\175\1\43\1\175\1\43\1\121"+
    "\1\43\13\0\6\43\6\0\1\43\1\176\1\76\1\176"+
    "\1\43\1\176\1\43\1\176\2\43\1\0\1\176\2\43"+
    "\3\176\3\43\1\176\6\43\1\176\1\43\1\176\1\43"+
    "\1\121\1\43\13\0\6\43\7\0\1\142\1\101\1\102"+
    "\1\103\1\142\4\0\1\105\11\0\1\102\44\0\1\144"+
    "\3\0\1\144\63\0\1\144\2\0\1\103\1\144\62\0"+
    "\2\150\1\0\7\150\1\0\24\150\1\0\1\150\13\0"+
    "\6\150\6\0\2\43\1\76\7\43\1\0\7\43\1\155"+
    "\14\43\1\121\1\43\13\0\6\43\6\0\2\43\1\76"+
    "\7\43\1\0\11\43\1\177\12\43\1\121\1\43\13\0"+
    "\6\43\6\0\2\157\1\0\7\157\1\0\24\157\1\0"+
    "\1\157\13\0\6\157\6\0\2\161\1\0\7\161\1\0"+
    "\24\161\1\0\1\161\13\0\6\161\23\0\1\200\104\0"+
    "\1\201\64\0\1\202\41\0\1\203\3\0\1\203\103\0"+
    "\1\204\66\0\1\205\47\0\1\43\1\171\1\135\1\136"+
    "\1\137\1\171\4\43\1\105\11\43\1\136\12\43\1\121"+
    "\1\43\13\0\6\43\6\0\1\43\1\172\1\76\1\136"+
    "\1\137\1\172\4\43\1\0\11\43\1\136\12\43\1\121"+
    "\1\43\13\0\6\43\6\0\1\43\1\174\1\76\2\43"+
    "\1\174\4\43\1\0\24\43\1\121\1\43\13\0\6\43"+
    "\6\0\1\43\1\174\1\76\1\43\1\137\1\174\4\43"+
    "\1\0\24\43\1\121\1\43\13\0\6\43\16\0\1\206"+
    "\72\0\1\207\104\0\1\210\40\0\1\65\3\0\1\65"+
    "\104\0\1\211\71\0\1\65\57\0\1\65\77\0\1\212"+
    "\57\0\1\205\77\0\1\213\76\0\1\65\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5096];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\1\11\15\1\1\11\1\1\2\11\1\1\12\11"+
    "\2\1\3\11\3\1\7\11\1\1\1\11\1\0\1\11"+
    "\10\1\1\0\3\1\1\0\1\11\2\0\1\11\2\1"+
    "\1\0\4\1\1\11\1\0\1\11\3\0\1\11\7\0"+
    "\7\1\1\0\4\1\1\11\1\0\4\1\1\11\1\1"+
    "\1\0\1\1\7\0\7\1\14\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[139];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private Language myLanguage;
  private boolean myAfterNS;

  public _ClojureLexer(Language language) {
    myLanguage = language;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _ClojureLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 46: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 47: break;
          case 3: 
            { return ClojureTokens.LINE_COMMENT;
            }
          case 48: break;
          case 4: 
            { return C_STRING_UNCLOSED;
            }
          case 49: break;
          case 5: 
            { yybegin(SYMBOL1); return C_SYM;
            }
          case 50: break;
          case 6: 
            { return C_NUMBER;
            }
          case 51: break;
          case 7: 
            { return C_SYM;
            }
          case 52: break;
          case 8: 
            { return C_QUOTE;
            }
          case 53: break;
          case 9: 
            { yybegin(DISPATCH);
            }
          case 54: break;
          case 10: 
            { return C_HAT;
            }
          case 55: break;
          case 11: 
            { return C_TILDE;
            }
          case 56: break;
          case 12: 
            { return C_AT;
            }
          case 57: break;
          case 13: 
            { return C_PAREN1;
            }
          case 58: break;
          case 14: 
            { return C_PAREN2;
            }
          case 59: break;
          case 15: 
            { return C_BRACKET1;
            }
          case 60: break;
          case 16: 
            { return C_BRACKET2;
            }
          case 61: break;
          case 17: 
            { return C_BRACE1;
            }
          case 62: break;
          case 18: 
            { return C_BRACE2;
            }
          case 63: break;
          case 19: 
            { return C_COMMA;
            }
          case 64: break;
          case 20: 
            { return C_SYNTAX_QUOTE;
            }
          case 65: break;
          case 21: 
            { yybegin(YYINITIAL); yypushback(yylength());
            }
          case 66: break;
          case 22: 
            { yybegin(YYINITIAL); return C_DOT;
            }
          case 67: break;
          case 23: 
            { yybegin(SYMBOL2); return C_SLASH;
            }
          case 68: break;
          case 24: 
            { yybegin(YYINITIAL); return BAD_CHARACTER;
            }
          case 69: break;
          case 25: 
            { yybegin(YYINITIAL); return C_SYM;
            }
          case 70: break;
          case 26: 
            { yybegin(YYINITIAL); yypushback(yylength()); return BAD_CHARACTER;
            }
          case 71: break;
          case 27: 
            { yybegin(YYINITIAL); yypushback(yylength()); return C_SHARP;
            }
          case 72: break;
          case 28: 
            { yybegin(YYINITIAL); yypushback(1); return C_SHARP;
            }
          case 73: break;
          case 29: 
            { yybegin(YYINITIAL); return C_SHARP_QUOTE;
            }
          case 74: break;
          case 30: 
            { yybegin(YYINITIAL); return C_SHARP_HAT;
            }
          case 75: break;
          case 31: 
            { yybegin(YYINITIAL); return C_SHARP_EQ;
            }
          case 76: break;
          case 32: 
            { yybegin(YYINITIAL); return C_SHARP_COMMENT;
            }
          case 77: break;
          case 33: 
            { yybegin(YYINITIAL); return C_SHARP_QMARK;
            }
          case 78: break;
          case 34: 
            { return C_STRING;
            }
          case 79: break;
          case 35: 
            { return C_CHAR;
            }
          case 80: break;
          case 36: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 1);
            { yybegin(SYMBOL0); return C_DOT;
            }
          case 81: break;
          case 37: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 1);
            { yybegin(SYMBOL0); return C_COLON;
            }
          case 82: break;
          case 38: 
            { yybegin(YYINITIAL); return C_SHARP_QMARK_AT;
            }
          case 83: break;
          case 39: 
            { return C_RDXNUM;
            }
          case 84: break;
          case 40: 
            { return C_RATIO;
            }
          case 85: break;
          case 41: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 2);
            { yybegin(SYMBOL0); return C_DOTDASH;
            }
          case 86: break;
          case 42: 
            { return C_HEXNUM;
            }
          case 87: break;
          case 43: 
            { return C_NIL;
            }
          case 88: break;
          case 44: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 2);
            { yybegin(SYMBOL0); return C_COLONCOLON;
            }
          case 89: break;
          case 45: 
            { return C_BOOL;
            }
          case 90: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}