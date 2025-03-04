package InterviewCodes;

public class printduplicatefromArray {

	public static void main(String[] args) {
		
		String []list= {"Java", "Python", "C#", "C", "Java", "React", "Java", "Python"};
		int listsize = list.length;
		int count =0;
		for (int i=0;i<listsize;i++) {
			for (int j =0; j<listsize;j++) {
				if (list[i]==list[j]) {
					count ++;
				}
			}
			if (count>1) {
				System.out.println(list[i]+" is occoured "+ count+ " times");
				count=0;
			}else {
				count =0;
			}
			
		}

	}

}
