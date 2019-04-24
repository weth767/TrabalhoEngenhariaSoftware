package util;

public class EmailValidation {
    /*método para validar o email*/
    public static boolean emailValidation(String email) {
        String name = null;
        String domain = null;
        String subdomain = null;
        /*verifica se o email está nulo, se estiver*/
        if (email == null){
            /*retorna false*/
            return false;
        }
        /*se estiver ok por enquanto, divide o email no nome do usuário, dominio e subdominio*/
        name = email.split("@")[0];
        domain = email.split("@")[1];
        subdomain = domain.split("\\.")[1];
        domain = domain.split("\\.")[0];
        /*verifica primeiramente o nome do usuário, se está no padrões do e-mails*/
        if (name.matches("\\w+") || (name.contains(".") || name.contains("-") || name.contains("_"))) {
            /*verifica se está utilizando um dominio válido*/
            if (domain.equals("gmail") || domain.equals("hotmail") || domain.equals("yahoo") ||
                domain.equals("bol") || domain.equals("uol") || domain.equals("outlook") ||
                domain.equals("live")){
                /*e por fim verifica o subdomino*/
                if(subdomain.equals("com")){
                    /*retorna true se estiver tudo ok*/
                    return true;
                }
            }
        }
        /*senão retorna false*/
        return false;
    }
}
