public class SearchInStrings {
    static void main() {
        String name = "pavan";
        char target = 'k';
        System.out.println(search(name, target));
    }
    static boolean search(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for(int i=0; i<name.length(); i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
