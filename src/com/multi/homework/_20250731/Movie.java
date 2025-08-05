package com.multi.homework._20250731;

public class Movie {
    String title;
    double rating;

    public Movie(String title, double rating) {
        this.title=title;
        this.rating=rating;
    }

    public static void main(String[] args) {
        Movie[]movie = new Movie[3];
        movie[0]=new Movie("스타 이즈 본", 9.1);
        movie[1]=new Movie("인터스텔라", 9.5);
        movie[2]=new Movie("드래곤 길들이기", 8.7);

        Movie bestMovie = movie[0];
        for(int i=1;i<movie.length;i++){
            if(bestMovie.rating<movie[i].rating){
                bestMovie=movie[i];
            }

        }
        System.out.println("최고 평점 영화: " + bestMovie.title + " (평점: " + bestMovie.rating + ")");
    }
}
