class RnaTranscription {

    static String transcribe(String dnaStrand) {
        char c;
        char[] chars = dnaStrand.toCharArray();


        for(int i=0;i<dnaStrand.length();i++){
            c = dnaStrand.charAt(i);
            if('G' == chars[i]) {
                chars[i] = 'C' ;
            }else if('C' == chars[i]) {
                chars[i] = 'G' ;
            }else if('T' == chars[i]) {
                chars[i] = 'A' ;
            }else if('A' == chars[i]) {
                chars[i] = 'U' ;
            }

        }
        dnaStrand = String.valueOf(chars);
        return dnaStrand;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

    }

    public static void main(String[] args){
        System.out.println(transcribe("AAAAA"));
    }


}
