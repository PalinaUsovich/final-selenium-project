package stepdefinition;

import java.util.ArrayList;
import java.util.List;

public class Practise {

    /**
     * Using one locator -> we will get all temps-webElement in List<WebElement] //[web1, web2, web3, web4]
     * List<WebElement> using getText() and for-loop, you will List<String> ["40*", 44*, 34*, 50*]
     * ["40*", 44*, 34*, 50*]
     * List<String> using for-loop, you will create List<Integer>
     *     first get rig of deg sign
     *     then convert string in to integer
     *     [40, 44, 34, 50]
     * Sort -> [34, 40, 44, 50]
     *  minValue is index-0 and maxValue is on imdex-(len-1)
     *  Webpage: getCurrent temp
     *      webElement-curr
     *      getText(webElement-curr) ->  "42*"
     *      getRid of deg sign then convert into integer
     *          "42*" -> "42" -> 42
     * Assert.assertTrue((42 >= minValue and 42 <= maxValue), "");
     */

    public static void main(String[] args) {

        List<String> tempStr = new ArrayList<>();
        tempStr.add("22°");
        tempStr.add("4°");
        tempStr.add(("10*"));     //["22°", "4°"]  -> ["22", "4"]
        for (String newTemp : tempStr) {
            String tempsText = newTemp.substring(0, newTemp.length() - 1);

            System.out.println(tempsText.toString());
        }

        //using subString method, get rid of last index.
        // 22° will become 22
        //then I'll "22" into int-22'
        //6.find max number in given array


        //7.find the min value in given array


    }
}





