package com.CourierServiceManagement
import com.practice.RatingSystem
import java.io.File

class ReviewAndRate {

    fun display() {
        val ratingSystem = RatingSystem()

        val file = File("review.txt")

        while (true) {
            println("Please provide your review (or type 'exit' to finish):")
            val reviewText = readLine() ?: ""

            if (reviewText.equals("exit", ignoreCase = true)) {
                break
            }

            println("Please provide your rating (1 to 5):")
            val rating = readLine()?.toIntOrNull() ?: 0

            // Write the review and rating to the file
            file.appendText("Review: $reviewText, Rating: $rating\n")

            ratingSystem.addReview(" ", reviewText, rating)
        }

        println("Average Rating: ${ratingSystem.getAverageRating()}")
        println("All Reviews:")
        ratingSystem.printReviews()
    }

}
