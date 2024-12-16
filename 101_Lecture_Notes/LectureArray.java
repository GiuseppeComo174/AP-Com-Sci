/* 
    Lecture note example - Arrays
*/
class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5, 5, 7, 8, 8, 8, 3, 3};
        int dupeCheck = (int)(Math.random() * 10) + 1;
        System.out.println("Random value to look for: " + dupeCheck);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == dupeCheck){
                System.out.println("Index: " + i + ". Value: " + arr[i]);
            }
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("Consect at " + i + " and " + (i+1))
            }
        }
	}
}