
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size)
    {
        String result = "";
        for(int i = 0; i< size; i++) {
            for(int s = 0; s<size; s++) {
                result+= "* ";
            }
            result += "\n";
        }
        return result;
    }

    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height)
    {
        String result = "";
        for(int i = 0; i< height; i++) {
            for (int h = 0; h < length; h++) {
                    result += "* ";
            }
            result += "\n";
        }
        // write your code here
        return result;
    }

    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     *
     *     * *
     *     * * *
     *     * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height)
    {
        String result = "";
        int counter = 1;
        for(int i = 0; i< height; i++) {
            for(int j = 0; j< counter; j++){
                result += "* ";
            }
            result += "\n";
            counter ++;
        }
        // write your code here
        return result;
    }

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     *     *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height)
    {
        String result = "";
        int counter = height;
        for(int i = 0; i< height; i++) {
            for(int j = 0; j< counter; j++){
                result += "* ";
            }
            result += "\n";
            counter --;
        }
        // write your code here
        return result;
    }

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */

    public static String PrintBackwardsRightTriangle(int height)
    {
        String s = "";
        for(int h = 0; h < height; h++) {

            for(int i = 0; i < height - h - 1; i++) {
                s = s + "  ";
            }
            for(int i = 0; i <= h; i++){
                s = s + "* ";
            }
            s = s + "\n";
        }
        return s;
    }

    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintEquilateralTriangle(int height)
    {
        String s = "";
        for(int h = 0; h < height; h++) {

            for(int i = 0; i < height - h - 1; i++) {
                s = s + " ";
            }
            for(int i = 0; i <= h; i++){
                s = s + "* ";
            }
            s = s + "\n";
        }
        return s;
    }
}
