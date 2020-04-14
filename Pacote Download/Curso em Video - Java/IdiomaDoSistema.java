import java.util.*;

class TesteUserLocale{
    public static void main(final String[] args) {
        final Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é: ");
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
    }
}