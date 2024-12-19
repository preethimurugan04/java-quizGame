public class Activity_7_Questions {
    // Question.java

    private int difficulty;
        private int money;
        private String statement;
        private String[] options;
        private int correctOption;

        public Activity_7_Questions(int difficulty, String statement, String[] options, int correctOption ,int money) {
            this.difficulty = difficulty;
            this.statement = statement;
            this.options = options;
            this.correctOption = correctOption;
            this.money = money;
        }

        public int getDifficulty() {
            return difficulty;
        }
        public int getMoney(){
            return money;
        }

        public String getStatement() {
            return statement;
        }

        public String[] getOptions() {
            return options;
        }

        public int getCorrectOption() {
            return correctOption;
        }
    }


