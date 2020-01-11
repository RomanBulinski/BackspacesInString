public class Main {

    public static void main(String[] args) {
        BackspacesInString backspacesInString = new BackspacesInString();
        System.out.println(   backspacesInString.cleanString( "aa#" )        );
        System.out.println(   backspacesInString.cleanString( "aa#a#" )        );
        System.out.println(   backspacesInString.cleanString( "aaaaa#a###" )        );
    }
}
