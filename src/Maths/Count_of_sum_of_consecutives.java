package Maths;

public class Count_of_sum_of_consecutives {

    //this is O(sqrt(n)) and O(1) extra space
    /*
    we can do it O(n) but with space complexity by using prefix sum
    first build prefix sum from 0 to n-1(because n-1 in question we have to find only 2 or more than consecutive number)
    then traverse prefix sum pre[i]-n if it is present in prefix then increase count
     */
    public static int countConsecutive(int n){
        int count=0;
        /*
        n=a+(a+1)+(a+2)+(a+3)+....+(a+l)
        n=(l+1)*a+(1+2+3+4...+l)
        n=(l+1)*a+l(l+1)/2
        maximum length of l is l(l+1)/2<n and starting length of l is one as given in question
         */
        for(int l=1;l*(l+1)<2*n;l++){
            double a=(double) ((1.0*n-(l*(l+1))/2)/(l+1));
            //check if 'a' in natural number or not
            if(a-(int)a==0.0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
