# Grade-Management-Program
##### *프로젝트 도중에는 수정사항이 많아 매번 리드미 파일을 수정하기 번거로우므로, <br>앞으로는 최종 커밋전까지 리드미 파일을 따로 수정하지 않겠습니다.*
#### 항공우주및 소프트웨어 공학부 2019011901 박무성
## Grade-Management-Program의 필요성
&nbsp;현재 학사 시스템 상, 졸업을 위한 각 학과별 학점이수 기준이 모두 다르기 때문에, 많은 학생들이 학점 관리에 불편함을 토로하고 있습니다.<br>
&nbsp;따라서 학생들이 더 간편하게 학점관리를 하고, 졸업계획을 세울 수 있도록 학점 관리 프로그램(Grade-Management-Program)을 만들고자 합니다.
 
## Grade-Management-Program의 기능
 
 >1. Add Subject **(구현 완료)**
 >2. Delete Subject **(구현 완료)**
 >3. Check my Subjects Info **(구현 완료)**
 >4. Check my Grade Avg **(구현 완료)(새롭게 추가!)**
 >5. Select Semester **(구현 완료)**
 >6. Show Menu **(구현 완료)**
 
 &nbsp;현재 위의 기능들을 구현하고 있습니다.

## Grade-Management-Program 내의 클래스
### 1. SubjectInfo Class
(SubjectInfo 클래스 코드 일부)
```java
public class SubjectInfo {
	//과목에 대한 정보를 저장하는 클래스
	private String subjectName;
	private String prof;
	private int grade;
	
	SubjectInfo(){
	}
}

```
&nbsp; SubjectInfo 클래스는 하나의 과목에 대한 정보를 담는 클래스로, 이 객체들이 모여서 SubjectStorage 객체 하나에 저장됩니다.<br>&nbsp;
### Methods of SubjectInfo class
&nbsp; SubjectInfo class의 메소드 <br>

>**print_subjectInfo : 과목 정보 출력**<br>
>**getSubjectName : 과목 이름 가져오기**<br>
>**setSubjectInfo : 과목 정보 설정**<br>
<br>
<br>

### 2. SubjectStorage Class
(SubjectStorage 클래스 코드 일부)
```java
 public class SubjectStorage extends SubjectInfo {
	//과목의 정보를 담고 있는 SubjectInfo 객체들을 담기 위한 HashSet
	private HashSet<SubjectInfo> subjectSet = new HashSet<SubjectInfo>();
	String semester;

	
	SubjectStorage(String semester){
		this.semester = semester;
	}
}
```
&nbsp; SubjectStorage는 SubjectInfo 클래스를 상속받는 자식 클래스로, HashSet을 이용해 SubjectInfo 객체를 저장합니다.<br>&nbsp;

### Methods of SubjectStorage class
&nbsp; SubjectStorage class의 메소드 <br>

>**addSubject : 과목 추가**<br>
>**deleteSubject : 과목 삭제**<br>
>**print_subjectSet : 해당 학기에 대한 모든 과목 정보 출력**<br>
>**gradeAvg : 해당 학기의 평점을 계산**<br>

### 3. GradeCalculator Class
```java
public class GradeCalculator {
	private HashSet<SubjectInfo> set;
	int gradeSum;
	
	public GradeCalculator() {
		this.gradeSum = 0;
	}
	
	public GradeCalculator(HashSet<SubjectInfo> set) {
		this.gradeSum = 0;
		this.set = set;
		
	}
}

```
&nbsp; GradeCalculator 클래스는 해당 학기의 평점을 계산하는 클래스입니다.<br>
### Methods of GradeCalculator class
&nbsp; GradeCalculator class의 메소드 <br>

>**calculateGradeAvg : 해당 학기의 평점 계산**<br>

#### *객체지향 프로그래밍 수업의 X-Management-Program 과제로 수행한 프로젝트입니다.*
