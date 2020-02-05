package TestPattern;

public class OracleServer implements DB {
        @Override
        public void open() {
            System.out.println("Opened Oracle DB");
        }

        @Override
        public void close() {
            System.out.println("Closed Oracle DB");
        }
}
