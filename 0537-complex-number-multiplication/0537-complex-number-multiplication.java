class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] a = num1.split("\\+");
        String[] b = num2.split("\\+");

        int r1 = Integer.parseInt(a[0]);
        int i1 = Integer.parseInt(a[1].replace("i", ""));

        int r2 = Integer.parseInt(b[0]);
        int i2 = Integer.parseInt(b[1].replace("i", ""));

        int real = r1 * r2 - i1 * i2;
        int imag = r1 * i2 + r2 * i1;

        return real + "+" + imag + "i";
    }
}