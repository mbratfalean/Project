
public class LenghtArray {
public int Lenght(int[] ans) {
	int b=0;
	for(int i=0;i<=ans.length;i++) {
		if (ans[i]==0) {
			break;
		}else {
			b++;
		}
	}
	return(b);
}
}
