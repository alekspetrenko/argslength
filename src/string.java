
public class string {
	int storage(String s) {
	    return s.length();
	}


public static void main(String[] args) {

    System.out.println("");

    for (int i = 0; i < args.length; i++)

        System.out.println(args[i]);
        System.out.println("Аргумент " + args[i] + "содержит: " storage(args[i]) + " символов.");

}



}
