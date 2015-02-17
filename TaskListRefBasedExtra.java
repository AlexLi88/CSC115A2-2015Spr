//This is the extra part
//For the insert method, if two tasks have same priority, I will put the task with 
//smaller task number next to the head  and the bigger one behind the smaller one. 


public class TaskListRefBasedExtra implements TaskList{
	private TaskListNodeAlt head;
	private int length;
	
	public TaskListRefBasedExtra(){
		this.head = null;
		this.length = 0;
	}
	
	public TaskListNodeAlt getHead(){
		return this.head;
	}
	
	public boolean isEmpty() {
		if(length==0){
			return true;
		}else{
			return false;
		}
	}

	
	public int getLength() {
		return this.length;
	}

	
	public Task removeHead() {
		TaskListNodeAlt tempHead = this.head;
		if(this.length == 0){
			return null;
		}else{
			head = head.next;
		}
		this.length--;
		return tempHead.task;
	}

	
	public Task remove(Task t) {
		if(this.length == 0){
			return null;
		}else{
			if(this.head.task.priority == t.priority && this.head.task.number == t.number){
				this.head = this.head.next;
				this.length--;
				return t;
			}else{
				TaskListNodeAlt tracker = this.head;
				while(tracker.next != null){
					if(tracker.next.task.priority == t.priority && tracker.next.task.number == t.number){
						tracker.next = tracker.next.next;
						this.length--;
						return t;
					}else{
						tracker = tracker.next;
					}
				}
			}
			return null;
		}
		
	}

	public void insertExtra(Task t){
		TaskListNodeAlt temp = new TaskListNodeAlt(t);
		TaskListNodeAlt tracker = this.head;
		if(this.length == 0){
			this.head = temp;
		}else{
			if(temp.task.priority > this.head.task.priority){
				temp.next = this.head;
				this.head = temp;
			}else{
				while(tracker.next != null){
					if(temp.task.priority >= tracker.next.task.priority){
						if(temp.task.priority == tracker.next.task.priority){
							if(temp.task.number > tracker.next.task.number){
								tracker = tracker.next;
								continue;
							}else{
								temp.next = tracker.next;
								tracker.next = temp;
								break;
							}
						}else{
							temp.next = tracker.next;
							tracker.next = temp;
							break;
						}
					}else{
						tracker = tracker.next;
					}
				}
				if(tracker.next == null){
					//if priority is same
					tracker.next = temp;
				}

			}
		}
		this.length++;
	}	
	
	public void insert(Task t) {
		TaskListNodeAlt temp = new TaskListNodeAlt(t);
		TaskListNodeAlt tracker = this.head;
		if(this.length == 0){
			this.head = temp;
		}else{
			if(temp.task.priority > this.head.task.priority){
				temp.next = this.head;
				this.head = temp;
			}else{
				//add to the middle
				while(tracker.next != null){
					//System.out.println("11111");
					if(temp.task.priority >= tracker.next.task.priority){
						if(temp.task.priority == tracker.next.task.priority){
								tracker = tracker.next;
								continue;
						}
						else{
							temp.next = tracker.next;
							tracker.next = temp;
							break;
						}
					}else{
						//tracker goes through the list. 
						tracker = tracker.next;
					}
				}
				//add to the tail
				if(tracker.next == null){
					//if priority is same
					tracker.next = temp;
				}
			}//end of else
		}
		
		//add the length of list by one.
		this.length++;
	}

	
	

	public Task retrieve(int i) {
		TaskListNodeAlt tracker = this.head;
		if(i > this.length-1){
			return null;
		}else{
			for(int x = 0; x < i; x++){
				tracker = tracker.next;
			}
			return tracker.task;
		}
		
	}

//this method is used for testing and dubug. 
	public String toString(){
		String result = "";
		TaskListNodeAlt tracker = this.head;
		for(int i = 0 ; i < this.length; i++){
			result += "( " + tracker.task.priority + " , " + tracker.task.number + " )\n";
			tracker = tracker.next;
		}
		return result;
	}

}
