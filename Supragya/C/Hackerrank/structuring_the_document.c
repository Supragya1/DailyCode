// Day86_Q1.c
// Structuring the Document Hackerrank
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <assert.h>
#define MAX_CHARACTERS 1005
#define MAX_PARAGRAPHS 5

struct word {
    char* data;
};

struct sentence {
    struct word* data;
    int word_count;//denotes number of words in a sentence
};

struct paragraph {
    struct sentence* data  ;
    int sentence_count;//denotes number of sentences in a paragraph
};

struct document {
    struct paragraph* data;
    int paragraph_count;//denotes number of paragraphs in a document
};
int newindex = 0 ; // declaring a global variable to keep track of the index of the text
struct word get_Word(char *text){
    struct word result_word ;
    int characters = 0;
    for(int i=(newindex) ; text[i] != ' ' && text[i] != '.' && text[i] != '\n' && text[i] != 0; i++){characters ++ ;}
    result_word.data = (char*)calloc(characters , sizeof(char)); 
    for(int i=0; i<characters; i++){
        result_word.data[i] = text[(newindex) + i];
    }
    for(int i=(newindex); (i + characters + 1)<strlen(text); i++ ){

            if( ('a' <= text[i + characters + 1] && text[i + characters + 1] <= 'z') || ('A' <= text[i + characters + 1] && text[i + characters + 1] <= 'Z' ) ){
               
                (newindex) = i + characters + 1;
                return result_word;
            }
    }
    return result_word ;
}
struct sentence get_Sentence(char *text){
    struct sentence sen ;
    sen.word_count = 1 ;
    for(int i=(newindex); text[i] != '.' && text[i] != '\n' && text[i] != 0; i++){
        if(text[i] == ' '){sen.word_count ++ ;}
    }
    sen.data = (struct word*)calloc(sen.word_count, sizeof(struct word));
    for(int i =0; i<sen.word_count; i++){
        sen.data[i] = get_Word(text );
    }
    return sen;
}

struct paragraph get_Paragraph(char *text){
    struct paragraph para ;

    para.sentence_count = 0;
    for(int i=(newindex); text[i] != '\n' && text[i] != 0  ; i++){
        if(text[i] == '.'){para.sentence_count ++ ;}
    }
    para.data = (struct sentence*)calloc(para.sentence_count, sizeof(struct sentence));
    for(int i=0; i<para.sentence_count ; i++){
        para.data[i] = get_Sentence(text );
    }
    return para;
}

struct document get_document(char* text) {

    struct document doc ;
    doc.paragraph_count = 1;
    for(int i =0 ; i<(strlen(text)) ; i++){ doc.paragraph_count ++ ;}

    doc.data = (struct paragraph*)calloc(doc.paragraph_count , sizeof(struct paragraph) ) ;

   

    for(int i=0; i<doc.paragraph_count; i++){
        doc.data[i] = get_Paragraph(text);
    }

    return doc ;

}


struct word kth_word_in_mth_sentence_of_nth_paragraph(struct document Doc, int k, int m, int n) {
    return Doc.data[n-1].data[m-1].data[k-1] ;
}

struct sentence kth_sentence_in_mth_paragraph(struct document Doc, int k, int m) { 
    return Doc.data[m-1].data[k-1] ;
}

struct paragraph kth_paragraph(struct document Doc, int k) {
    return Doc.data[k-1] ;
}


void print_word(struct word w) {
    printf("%s", w.data);
}

void print_sentence(struct sentence sen) {
    for(int i = 0; i < sen.word_count; i++) {
        print_word(sen.data[i]);
        if (i != sen.word_count - 1) {
            printf(" ");
        }
    }
}

void print_paragraph(struct paragraph para) {
    for(int i = 0; i < para.sentence_count; i++){
        print_sentence(para.data[i]);
        printf(".");
    }
}

void print_document(struct document doc) {
    for(int i = 0; i < doc.paragraph_count; i++) {
        print_paragraph(doc.data[i]);
        if (i != doc.paragraph_count - 1)
            printf("\n");
    }
}

char* get_input_text() {	
    int paragraph_count;
    scanf("%d", &paragraph_count);

    char p[MAX_PARAGRAPHS][MAX_CHARACTERS], doc[MAX_CHARACTERS];
    memset(doc, 0, sizeof(doc));
    getchar();
    for (int i = 0; i < paragraph_count; i++) {
        scanf("%[^\n]%*c", p[i]);
        strcat(doc, p[i]);
        if (i != paragraph_count - 1)
            strcat(doc, "\n");
    }

    char* returnDoc = (char*)malloc((strlen (doc)+1) * (sizeof(char)));
    strcpy(returnDoc, doc);
    return returnDoc;
}

int main() 
{
    char* text = get_input_text();
    struct document Doc = get_document(text);

    int q;
    scanf("%d", &q);

    while (q--) {
        int type;
        scanf("%d", &type);

        if (type == 3){
            int k, m, n;
            scanf("%d %d %d", &k, &m, &n);
            struct word w = kth_word_in_mth_sentence_of_nth_paragraph(Doc, k, m, n);
            print_word(w);
        }

        else if (type == 2) {
            int k, m;
            scanf("%d %d", &k, &m);
            struct sentence sen= kth_sentence_in_mth_paragraph(Doc, k, m);
            print_sentence(sen);
        }

        else{
            int k;
            scanf("%d", &k);
            struct paragraph para = kth_paragraph(Doc, k);
            print_paragraph(para);
        }
        printf("\n");
    }     
}