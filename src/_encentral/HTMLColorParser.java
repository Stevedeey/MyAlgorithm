package _encentral;

import java.util.Map;

public class HTMLColorParser {

    /**INSTRUCTION
     * In this kata you parse RGB colors represented by strings. The formats are primarily used in HTML and CSS.
     * Your task is to implement a function which takes a color as a string and returns the parsed color as a map (see Examples).
     * */

    /**
     * Input:
     * The input string represents one of the following:
     * <p>
     * 6-digit hexadecimal - "#RRGGBB"
     * e.g. "#012345", "#789abc", "#FFA077"
     * Each pair of digits represents a value of the channel in hexadecimal: 00 to FF
     * 3-digit hexadecimal - "#RGB"
     * e.g. "#012", "#aaa", "#F5A"
     * Each digit represents a value 0 to F which translates to 2-digit hexadecimal: 0->00, 1->11, 2->22, and so on.
     * Preset color name
     * e.g. "red", "BLUE", "LimeGreen"
     * You have to use the predefined map PRESET_COLORS (JavaScript, Python, Ruby), presetColors (Java, C#, Haskell), or preset-colors (Clojure).
     * The keys are the names of preset colors in lower-case and the values are the corresponding colors in 6-digit hexadecimal (same as 1. "#RRGGBB").
     * <p>
     * <p>
     * <p>
     * EXAMPLE
     * parse("#80FFA0")   === new RGB(128, 255, 160))
     * parse("#3B7")      === new RGB( 51, 187, 119))
     * parse("LimeGreen") === new RGB( 50, 205,  50))
     */


    private final Map<String, String> presetColors;

    public HTMLColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }


    /*  presetColors Map has the following
    ##########################################################################################################################
    ##########################################################################################################################
    * {lightslategrey=#778899, darkviolet=#9400d3, bisque=#ffe4c4, cyan=#00ffff, darkslateblue=#483d8b, lightgrey=#d3d3d3,
    *  khaki=#f0e68c, darkgray=#a9a9a9, blanchedalmond=#ffebcd, saddlebrown=#8b4513, darkblue=#00008b, lightcoral=#f08080,
    * moccasin=#ffe4b5, orangered=#ff4500, azure=#f0ffff, lightgoldenrodyellow=#fafad2, skyblue=#87ceeb, chartreuse=#7fff00,
    *  deepskyblue=#00bfff, mediumpurple=#9370db, lightyellow=#ffffe0, violet=#ee82ee, palevioletred=#db7093, dimgrey=#696969,
    *  rosybrown=#bc8f8f, honeydew=#f0fff0, mediumblue=#0000cd, darkseagreen=#8fbc8f, limegreen=#32cd32, paleturquoise=#afeeee,
    * burlywood=#deb887, mediumorchid=#ba55d3, papayawhip=#ffefd5, silver=#c0c0c0, chocolate=#d2691e, lightsteelblue=#b0c4de,
    * pink=#ffc0cb, darkgreen=#006400, seashell=#fff5ee, sienna=#a0522d, thistle=#d8bfd8, yellow=#ffff00, cornsilk=#fff8dc,
    * lightseagreen=#20b2aa, blueviolet=#8a2be2, tomato=#ff6347, cornflowerblue=#6495ed, gold=#ffd700, sandybrown=#f4a460,
    * springgreen=#00ff7f, crimson=#dc143c, gray=#808080, mediumvioletred=#c71585, slategrey=#708090, darkcyan=#008b8b,
    * ivory=#fffff0, darkmagenta=#8b008b, wheat=#f5deb3, indianred=#cd5c5c, darkorchid=#9932cc, mintcream=#f5fffa,
    *  whitesmoke=#f5f5f5, lightpink=#ffb6c1, black=#000000, teal=#008080, cadetblue=#5f9ea0, beige=#f5f5dc, darkkhaki=#bdb76b,
    *  blue=#0000ff, darkslategray=#2f4f4f, royalblue=#4169e1, seagreen=#2e8b57, purple=#800080, orchid=#da70d6, forestgreen=#228b22,
    * darksalmon=#e9967a, palegreen=#98fb98, lightslategray=#778899, navy=#000080, rebeccapurple=#663399, greenyellow=#adff2f,
    * red=#ff0000, aqua=#00ffff, dodgerblue=#1e90ff, lightblue=#add8e6, white=#ffffff, olive=#808000, coral=#ff7f50,
    * peachpuff=#ffdab9, darkolivegreen=#556b2f, darkturquoise=#00ced1, darkgrey=#a9a9a9, lavender=#e6e6fa, gainsboro=#dcdcdc,
    * lightgray=#d3d3d3, plum=#dda0dd, tan=#d2b48c, midnightblue=#191970, powderblue=#b0e0e6, dimgray=#696969, lemonchiffon=#fffacd,
    * salmon=#fa8072, brown=#a52a2a, lightgreen=#90ee90, goldenrod=#daa520, steelblue=#4682b4, lightsalmon=#ffa07a, darkred=#8b0000,
    *  snow=#fffafa, olivedrab=#6b8e23, yellowgreen=#9acd32, indigo=#4b0082, lawngreen=#7cfc00, magenta=#ff00ff, aquamarine=#7fffd4,
    *  floralwhite=#fffaf0, antiquewhite=#faebd7, hotpink=#ff69b4, turquoise=#40e0d0, peru=#cd853f, fuchsia=#ff00ff, aliceblue=#f0f8ff,
    * firebrick=#b22222, darkgoldenrod=#b8860b, lavenderblush=#fff0f5, navajowhite=#ffdead, mediumspringgreen=#00fa9a, mistyrose=#ffe4e1,
    *  slategray=#708090, darkorange=#ff8c00, linen=#faf0e6, slateblue=#6a5acd, lightcyan=#e0ffff, lightskyblue=#87cefa,
    * mediumseagreen=#3cb371, deeppink=#ff1493, mediumturquoise=#48d1cc, ghostwhite=#f8f8ff, green=#008000, lime=#00ff00,
    * mediumaquamarine=#66cdaa, oldlace=#fdf5e6, grey=#808080, orange=#ffa500, darkslategrey=#2f4f4f, mediumslateblue=#7b68ee,
    *  maroon=#800000, palegoldenrod=#eee8aa}
      input: "#80FFA0"
    * ##########################################################################################################################
      ##########################################################################################################################
    * */


//    private RGB hexadecimalToRGBConverter(String color) {
//        //#FFF
//        String red = "", green = "", blue = "";
//        if (color.length() == 4) {
//            red = color.substring(1, 2) + color.substring(1, 2);
//            green = color.substring(2, 3) + color.substring(2, 3);
//            blue = color.substring(3, 4) + color.substring(3, 4);
//        }
//
//        red = color.substring(1, 3);
//        green = color.substring(3, 5);
//        blue = color.substring(5, 7);
//        return new RGB(Integer.parseInt(red, 16),
//                Integer.parseInt(green, 16),
//                Integer.parseInt(blue, 16));
//    }
//
//    public RGB parseHexadecimal(String color) {
//        return hexadecimalToRGBConverter(presetColors.getOrDefault(color.toLowerCase(), color));
//    }

}

/**
 * import java.util.Map;
 *
 * public class HtmlColorParser {
 *     private final Map<String, String> presetColors;
 *
 *     public HtmlColorParser(Map<String, String> presetColors) {
 *         this.presetColors = presetColors;
 *     }
 *
 *   private RGB hexadecimal(String color){
 *
 *     String red, green, blue;
 *     if(color.length() == 4){
 *       red = color.substring(1,2) + color.substring(1,2);
 *       green = color.substring(2,3) + color.substring(2,3);
 *       blue = color.substring(3,4) + color.substring(3,4);
 *     }else{
 *
 *      red = color.substring(1,3);
 *      green = color.substring(3,5);
 *      blue = color.substring(5,7);
 *     }
 *     return new RGB(Integer.parseInt(red,16),
 *                  Integer.parseInt(green,16),
 *                   Integer.parseInt(blue,16));
 *   }
 *
 *     public RGB parse(String color) {
 *
 *         return hexadecimal(presetColors.getOrDefault(color.toLowerCase(), color));
 *     }
 * }
 *
 *
 * */
