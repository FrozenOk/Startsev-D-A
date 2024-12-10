abstract class AuthenticationMethod {
    // Шаблонный метод
    public final void authenticate() {
        collectCredentials();
        if (validateCredentials()) {
            System.out.println("Аутентификация успешна.");
        } else {
            System.out.println("Ошибка аутентификации.");
        }
    }

             // Абстрактные методы для реализации в подклассах
    protected abstract void collectCredentials();

    protected abstract boolean validateCredentials();
}

class PasswordAuthentication extends AuthenticationMethod {
    private String username;
    private String password;

    @Override
    protected void collectCredentials() {
        // Симуляция ввода данных

        username = "user";
        password = "password";
        System.out.println("Собраны учетные данные: имя пользователя и пароль.");
    }

    @Override
    protected boolean validateCredentials() {
        // Симуляция проверки пароля
        return "user".equals(username) && "password".equals(password);
    }
}

class FingerprintAuthentication extends AuthenticationMethod {
    private boolean fingerprintScanned;

    @Override
    protected void collectCredentials() {
        // Симуляция сканирования отпечатка пальца
        fingerprintScanned = true;
        System.out.println("Отпечаток пальца отсканирован.");
    }

    @Override
    protected boolean validateCredentials() {
        // Симуляция проверки отпечатка пальца

       return fingerprintScanned;
    }
}

class OAuthAuthentication extends AuthenticationMethod {
    private String token;

    @Override
    protected void collectCredentials() {
        // Симуляция получения токена OAuth
        token = "valid_token";
        System.out.println("Получен токен OAuth.");
    }

    @Override

    protected boolean validateCredentials() {
        // Симуляция проверки токена OAuth
        return "valid_token".equals(token);
    }
}

public class Main {
    public static void main(String[] args) {
        AuthenticationMethod passwordAuth = new PasswordAuthentication();
        AuthenticationMethod fingerprintAuth = new FingerprintAuthentication();
        AuthenticationMethod oauthAuth = new OAuthAuthentication();









        System.out.println("Аутентификация с паролем:");
        passwordAuth.authenticate();

        System.out.println("\nАутентификация с отпечатком пальца:");
        fingerprintAuth.authenticate();

        System.out.println("\nАутентификация через OAuth:");
        oauthAuth.authenticate();
    }
}
