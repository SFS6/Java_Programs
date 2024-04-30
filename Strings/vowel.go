package main
import("fmt","strings","unicode")
func threevowels(word string)  bool{
	vowelCount:=0
	for _,char:=range word{
		if unicode.IsLower(char)||unicode.isUpper(char){
			switch char{
				case 'a','e','i','o','u','A','E','I','O','U': vowelCount++;			}
		}
	}
	return vowelCount>=3;
}
func findwords(sentence string) []string{
	words:=strings.Fields(sentence)
	resut:=[]strings{}
	for_,word:= range words{
		if threevowels(word){
			result=append(result,word)
		}
	}
	return result;

}
func main(){
	var sentence stringfmt.Print("Enter a Sentence":)
	fmt.ScanIn(&sentence)
	output:=findwords(sentence)
	fmt.Println("Output:",output)
}
