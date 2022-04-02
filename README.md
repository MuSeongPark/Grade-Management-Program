# Grade-Management-Program
#### 항공우주및 소프트웨어 공학부 2019011901 박무성
## Grade-Management-Program의 필요성
&nbsp;현재 학사 시스템 상, 졸업을 위한 각 학과별 학점이수 기준이 모두 다르기 때문에, 많은 학생들이 학점 관리에 불편함을 토로하고 있습니다.<br>
&nbsp;따라서 학생들이 더 간편하게 학점관리를 하고, 졸업계획을 세울 수 있도록 학점 관리 프로그램(Grade-Management-Program)을 만들고자 합니다.
 
## Grade-Management-Program의 기능
 
 >1. Add Subject **(구현 완료)**
 >2. Delete Subject **(구현 완료)**
 >3. Check my Subjects and Grade **(진행 중)**
 >4. Select Semester **(구현 완료)**
 >5. Show Menu **(구현 완료)**
 
 &nbsp;현재 위의 기능들을 구현하고 있습니다.

## Grade-Management-Program 내의 클래스
### 1. SubjectInfo Class
<pre><code class="language-java">
public class SubjectInfo {
	//과목에 대한 정보를 저장하는 클래스
	private String subjectName;
	private String prof;
	private int grade;
	
	
	SubjectInfo(String subjectName, String prof, int grade){
		this.subjectName = subjectName;
		this.prof = prof;
		this.grade = grade;
		
	}
}

</code></pre>
### 2. SubjectStorage Class
 <pre><code class="language-java">
 public class SubjectStorage {
	//과목의 정보를 담고 있는 SubjectInfo 객체들을 담기 위한 HashSet
	private HashSet<SubjectInfo> subjectSet = new HashSet<SubjectInfo>();
	String semester;

	
	SubjectStorage(String semester){
		this.semester = semester;
	}
}
 </code></pre>



### 객체지향 프로그래밍 수업의 X-Management-Program 과제로 수행한 프로젝트입니다.
