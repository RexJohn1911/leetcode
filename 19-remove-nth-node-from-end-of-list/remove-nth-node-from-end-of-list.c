/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode *temp=head;
    struct ListNode *del=head;
    int count=0;
    while(del!=NULL){
        count++;
        del=del->next;
    }
    if(n==count){
        head=head->next;
        return head;
    }
    int len=count-n-1;
    for(int i=0;i<len;i++){
        temp=temp->next;
    }
    temp->next=temp->next->next;
    return head;
}
    