public class Range {

    public boolean validateก้ามปูเปิด(String input) {
        return input.charAt(0) == '[';
    }

    public int show(String input) {
        if (validateก้ามปูเปิด(input)) {
            return input.charAt(1) - 48;
        }
        return input.charAt(1) - 47;
    }

    public boolean validateก้ามปูปิด(String input) {
        return input.endsWith("]");
    }

    public int showLast(String input) {
        if(validateก้ามปูปิด(input)) {
            return input.charAt(3) - 48;
        }
        return input.charAt(3) - 490;
    }

    public String showResult(String input) {
        String result = "";
        for(int i=show(input); i<=showLast(input); i++) {
            result += i + ",";
        }
        return result.substring(0, result.length()-1);
    }
}