package day07;

public class 이진트리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		// 1. 이진검색트리에 자료를 삽입하기(만들기)
		bst.makeTree();
		
		// 2. 운행(트리에 어떤 노드가 있는지 알아보는 것) 1) 중위운행, 2) 전위운행, 3) 후위운행
//		System.out.println("------------");
//		System.out.println("중위(InOrder) 운행 Left-Root-Right");
//		bst.inOrder(bst.root);
//		System.out.println("------------");
//		System.out.println("전위(InOrder) 운행 Root-Left-Right");
//		bst.preOrder(bst.root);
//		System.out.println("------------");
//		System.out.println("후위(InOrder) 운행 Left-Right-Root");
//		bst.postOrder(bst.root);
		
		// 검색하기 "snowman"이 이진트리안에 있나?
		bst.search("hot");
		// 삭제하기
		bst.delete("hot");
		
	}

}
class BinarySearchTree{
	TreeNode root = null;
	// 삽입-만들기
	public void makeTree() {
		// TODO Auto-generated method stub
		String[] words = {
				"rain", "rainbow", "opera", "question", "cloud", "windy", "snow", "snowman", "sunny", "cold", "hot", "desk", "flower", "survey" };
		for(String w : words) {
			insert(w);
		}
	}

	public void delete(String data) {
		// TODO Auto-generated method stub
		// 1. 위치찾기, 삭제하고 나면 부모노드에 대한 정보가 필요하다
		// 2. 왼쪽 자식이 없는 경우
		// 3. 오르쪽 자식이 없을 경우
		// 4. 자식이 둘인 경우
		TreeNode pTrace = root;
		TreeNode parent = null;
		boolean isLeftChild = true;
		
		boolean found = false;
		while(pTrace != null ) {
			if(pTrace.data.equals(data)) {found = true; break;}
			parent = pTrace;
			if(pTrace.data.compareTo(data) > 0) pTrace = pTrace.left;
			else {pTrace = pTrace.right; isLeftChild = false;}
		}
		if(!found) return; // 못찾은 경우
		
		
		// 2. 왼쪽 자식이 없을 경우
		if(pTrace.left == null) {
			if(pTrace == root) root = pTrace.right;
			else if(isLeftChild) parent.left = pTrace.right;
				else parent.right = pTrace.right;
			return;
		}
		// 3. 오른쪽 자식이 없을 경우
		if(pTrace.right == null) {
			if(pTrace == root) root = pTrace.left;
			else if(isLeftChild) parent.left = pTrace.left;
			else parent.right = pTrace.left;
			return;
		}
		// 자식이 둘다 있을 경우
		// 위치배정을 다시 해야 한다. 그냥 아무데나 골라서 바꿔치기 한 후 삭제
		// 삭제할 대상의 노드의 오른쪽 서브루트에서 가장 작은 대상을 찾아 바꿔치기 한다(개발자가 만든)
		// 삭제 대상의 오른쪽 서브트리의 참조를 가져 온다
		TreeNode pSubParent = pTrace;
		TreeNode pSub = pTrace.right;
		while(pSub.left != null) {
			pSubParent = pSub;
			pSub = pSub.left;
		}
		pTrace.data = pSub.data;
		if(pSubParent.left != null) {
			pSubParent = pSub;
			pSub = pSub.left;
		}
		pTrace.data = pSub.data;
		if(pSubParent.left == pSub) pSubParent.left = pSub.right;
		else pSubParent.right = pSub.right;
	}

	public void search(String data) {
		// TODO Auto-generated method stub
		// data가 트리에 있는지 찾아 주는 것
		TreeNode pTrace = root;
		int cnt = 0; // 몇번만에 찾았는지
		while(pTrace != null) {
			cnt++;
			if(pTrace.data.equals(data)) {
				System.out.printf("%d번만에 데이터를 찾았음", cnt);
				return;
			}
			if(pTrace.data.compareTo(data) > 0) pTrace = pTrace.left;
			else pTrace = pTrace.right;
		}
		System.out.println("못찾음");
	}

	public void postOrder(TreeNode t) {
		// TODO Auto-generated method stub
		// 중위운행
		if(t==null) return;
		postOrder(t.left);
		System.out.printf(t.data + " ");
		postOrder(t.right);
		
	}
	public void preOrder(TreeNode t) {
		// TODO Auto-generated method stub
		// 중위운행
		if(t==null) return;
		preOrder(t.left);
		preOrder(t.right);
		System.out.printf(t.data + " ");
		
	}
	public void inOrder(TreeNode t) {
		// TODO Auto-generated method stub
		// 중위운행
		if(t==null) return;
		inOrder(t.left);
		System.out.printf(t.data + " !! ");
		inOrder(t.right);
		
	}

	private void insert(String data) {
		// TODO Auto-generated method stub
		// 트리에 달아주기
		// 새로운 노드를 만들어서 root에서
		// data를 비교해서 작으면 노드의 왼쪽으로 이동한다. null을 찾을 때까지
		// data를 비교해서 크면 노드의 오른쪽으로 이동한다. 언제까지? null을 찾을 때까지 
		
		// 새로운 노드가 들어갈 위치 찾기
		TreeNode pTrace = root;
		TreeNode pTrace2 = null;
		
		while(pTrace != null) {
			if(pTrace.data.equals(data)) return;
			pTrace2 = pTrace;
			if(pTrace.data.compareTo(data) > 0) pTrace = pTrace.left;// 참인경우 달려있는 데이터보다 새로들어온 데이터가 작은 경우
			else pTrace = pTrace.right;
		} // pTrace2에는 달아줄 노드의 부모 위치, pTrace에는 달아줄 노드 위치
		TreeNode newNode = new TreeNode(data); 
		if(pTrace2 == null) root = newNode; //제일 처음인 경우
		else {
			if(pTrace2.data.compareTo(data) > 0) pTrace2.left = newNode;
			// if(pTrace2.data.compareTo(data) < 0) pTrace.right = newNode;
			pTrace2.right = newNode;
		}
		
	}
	// 검색
	// 삭제
} // end BinarySearchTree

class TreeNode{
	String data; //데이터값
	TreeNode left; //왼쪽에 달리는 노드
	TreeNode right; // 오른쪽에 달리는 노드
	
	public TreeNode() {
		data = " ";
		left = null;
		right = null;
	} // 기본생성자 초기값 넣기
	public TreeNode(String data) {
		this.data=data;
		left=null;
		right=null;
	}// 명시적 생성자 data를 받아서 인스턴스 변수에 넣어주기
	
	public String toString() {
		return data;
	}
}