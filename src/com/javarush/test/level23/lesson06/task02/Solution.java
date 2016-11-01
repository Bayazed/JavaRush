package com.javarush.test.level23.lesson06.task02;

/* Рефакторинг
Отрефакторите класс Solution: вынесите все константы в public вложенный(nested) класс Constants.
Запретите наследоваться от Constants.
*/
public class Solution {

    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
            super(Constants.SERVER);
        }

        public ServerNotAccessibleException(Throwable cause) {
            super(Constants.SERVER, cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super(Constants.UNAUTHORIZED);
        }

        public UnauthorizedUserException(Throwable cause) {
            super(Constants.UNAUTHORIZED, cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super(Constants.BANNED);
        }

        public BannedUserException(Throwable cause) {
            super(Constants.BANNED, cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super(Constants.RESTRICTION);
        }

        public RestrictionException(Throwable cause) {
            super(Constants.RESTRICTION, cause);
        }
    }

    public static final class Constants
    {
        public static final String SERVER = "Server is not accessible for now.";
        public static final String UNAUTHORIZED = "User is not authorized.";
        public static final String BANNED = "User is banned.";
        public static final String RESTRICTION = "Access is denied.";
    }
}
