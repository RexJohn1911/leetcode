/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* mergeInBetween(struct ListNode* list1, int a, int b, struct ListNode* list2){
    struct ListNode *start1=list1;
    for(int i=0;i<a-1;i++){
        start1=start1->next;
    }
    struct ListNode *connect=list1;
    for(int i=0;i<=b;i++){
        connect=connect->next;
    }
    start1->next=list2;
    struct ListNode *end=list2;
    while(end->next!=NULL){
        end=end->next;
    }
    end->next=connect;
    return list1;
}