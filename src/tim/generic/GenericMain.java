package tim.generic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var allReview = new ArrayList<Feedback>();

        while(true){
            System.out.println("Enter your decision : \n1 -> Quit\n2 -> Review\n3 -> GetReview");
            String input = br.readLine();
            if (input.equals("1")){
                System.out.println("Thanks for reviewing");
                break;
            } else if (input.equals("2")) {
                System.out.println("Enter your review");
                String review = br.readLine();
                var reviewType = feedbackType(review);
                allReview.add(reviewType);
            } else {
                System.out.println("""
                        Enter the type of Review

                        1 -> Pricing
                        2 -> Deliver
                        3 -> Product
                        4 -> CustomerSupport
                        5 -> Unidentified
                        6 -> All
                        7 -> BackMenu""");
                String reviewType = br.readLine();
            }
        }

    }

    protected static Feedback feedbackType(String review){
        Feedback feedback = new Unidentified(review);
        review = review.toLowerCase();
        if (review.contains("price")){
            return new Pricing(review);
        } else if (review.contains("delivery")) {
            return new Deliver(review);
        }else if (review.contains("support")) {
            return new CustomerSupport(review);
        } else if (review.contains("product")) {
            return new Product(review);
        }

        return feedback ;
    }
}

class Review {

    private String review ;

    public Review(String review) {
        this.review = review;
    }
}

interface Feedback{

    <T> List<T> getAllReview(T t);
}

class Pricing extends Review implements Feedback{

    public Pricing(String review) {
        super(review);
    }

    @Override
    public <T> List<T> getAllReview(T t) {
        return List.of();
    }
}

class Deliver extends Review implements Feedback {

    public Deliver(String review) {
        super(review);
    }

    @Override
    public <T> List<T> getAllReview(T t) {
        return List.of();
    }
}

class Product extends Review implements Feedback {

    public Product(String review) {
        super(review);
    }

    @Override
    public <T> List<T> getAllReview(T t) {
        return List.of();
    }
}

class CustomerSupport extends Review implements Feedback {

    public CustomerSupport(String review) {
        super(review);
    }

    @Override
    public <T> List<T> getAllReview(T t) {
        return List.of();
    }
}

class Unidentified extends Review implements Feedback {

    public Unidentified(String review) {
        super(review);
    }

    @Override
    public <T> List<T> getAllReview(T t) {
        return List.of();
    }
}