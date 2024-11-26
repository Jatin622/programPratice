package com.programmingPratice.stream.pepcoadingStream;

public class upper {
    public static void main(String[] args) {
        String name = "my name is lap";
        StringBuilder stringBuilder = new StringBuilder();

        name.chars()
                .mapToObj(ch -> (ch == 'a') ? 'A' : (char) ch)
                .forEach(stringBuilder::append);

        System.out.println(stringBuilder);
    }
}
