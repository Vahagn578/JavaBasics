class average {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,8,2,3,0,9,4};
        double sum = 0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println(avg);
    }
}
