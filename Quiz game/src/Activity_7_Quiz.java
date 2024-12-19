import java.util.Scanner;

public class Activity_7_Quiz {
    // QuizGame.java

        private int playerRewardAmount;
        private Activity_7_Questions[] questions;
        private int currentQuestionIndex;

        public Activity_7_Quiz(Activity_7_Questions[] questions) {
            this.playerRewardAmount = 0;
            this.questions = questions;
            this.currentQuestionIndex = 0;
        }

        public void startGame() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to Who Wants to be a Millionaire");
            while (currentQuestionIndex < questions.length) {
                Activity_7_Questions currentQuestion = questions[currentQuestionIndex];
                System.out.println("Question Difficulty: " + currentQuestion.getDifficulty());
                System.out.println(currentQuestion.getStatement());
                String[] options = currentQuestion.getOptions();
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + ". " + options[i]);
                }

                System.out.print("Your answer (1-4): ");
                int playerAnswer = scanner.nextInt();

                if (playerAnswer == currentQuestion.getCorrectOption()) {
                    System.out.println("Correct! You earned " + currentQuestion.getMoney() + " pounds.\n");
                    playerRewardAmount += currentQuestion.getMoney();
                } else {
                    System.out.println("Incorrect. Game over. You have earned: " + playerRewardAmount);
                    break;
                }

                currentQuestionIndex++;
            }

            System.out.println("Congratulations! You completed the quiz. Your total amount of money you earned is: " + playerRewardAmount);
        }

        public static void main(String[] args) {
            // Create an array of questions
            Activity_7_Questions[] questions = {
                    new Activity_7_Questions(100, "Who is the Founder of Apple phones?", new String[]{"Steve Jobs", "Mark", "Elon Musk", "Hawking"}, 1,500),
                    new Activity_7_Questions(200, "Who won the football world cup 2022?", new String[]{"Portugal", "Brazil", "Spain", "Argentina"}, 4,1000),
                    new Activity_7_Questions(300, "Who won an oscar for playing the joker character?", new String[]{"Brad Pitt", "Joaquin Phoenix", "Daniel Craig", "Leonardo DiCaprio"}, 2,1500),
                    new Activity_7_Questions(400, "When was the movie Titanic released?", new String[]{"2000", "2012", "1997", "1980"}, 3,2000),
                    new Activity_7_Questions(500, "Who painted the Mona Lisa?", new String[]{"Leonardo DiCaprio", "Leonardo da Vinci", "Michelangelo", "Sandro Botticelli"}, 2,2500),
                    new Activity_7_Questions(600, "When was the first photograph taken?", new String[]{"1900", "2002", "1999", "1826"}, 4,3000),
                     // Add more questions with different difficulty levels
            };

            // Create a QuizGame instance and start the game
            Activity_7_Quiz quizGame = new Activity_7_Quiz(questions);
            quizGame.startGame();
        }
    }


