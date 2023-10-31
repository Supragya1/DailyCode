// Day86_Q1.c
// Querying The Document Hackerrank
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include<assert.h>
#define MAX_CHARACTERS 1005
#define MAX_PARAGRAPHS 5

char* kth_word_in_mth_sentence_of_nth_paragraph(char**** document, int k, int m, int n) {
return document[n-1][m-1][k-1];
}

char** kth_sentence_in_mth_paragraph(char**** document, int k, int m) { 
return document[m-1][k-1];
}

char*** kth_paragraph(char**** document, int k) {
return document[k-1];
}

#define MAX_SENTENCES 30
#define MAX_WORDS 100

char**** get_document(char* text) {
    // allocate memory
    char**** document = (char****)malloc(MAX_PARAGRAPHS * sizeof(char***));
    for (size_t i_paragraph=0; i_paragraph < MAX_PARAGRAPHS; ++i_paragraph) {
        char*** paragraph = (char***)malloc(MAX_SENTENCES * sizeof(char**));
    
        for (size_t i_sentence=0; i_sentence < MAX_SENTENCES; ++i_sentence) {
            char** sentence = (char**)malloc(MAX_WORDS * sizeof(char*));
    
            for (size_t i_word=0; i_word < MAX_WORDS; ++i_word) {
                char* word = (char*)calloc(MAX_CHARACTERS, sizeof(char));
                sentence[i_word] = word;
            }
            paragraph[i_sentence] = sentence;
        }
        document[i_paragraph] = paragraph;
    }
    
    // fill document
    for (
        int i=0, currentParagraph=0, currentSentence=0, currentWord=0;
        i <= strlen(text);
        i++
    ) {
        char c = text[i];
        if (c == '\n'){
            // start a new paragraph
            currentParagraph++;
            currentSentence = 0;
            currentWord = 0;
            continue;
        }
        if (c == '.'){
            // start a new sentence
            currentSentence++;
            currentWord = 0;
            continue;
        }
        if (c == ' '){
            // start a new word
            currentWord++;
            continue;
        }
        // add char to word
        strncat(document[currentParagraph][currentSentence][currentWord], &c, 1);
    }
    return document;
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

void print_word(char* word) {
    printf("%s", word);
}

void print_sentence(char** sentence) {
    int word_count;
    scanf("%d", &word_count);
    for(int i = 0; i < word_count; i++){
        printf("%s", sentence[i]);
        if( i != word_count - 1)
            printf(" ");
    }
} 

void print_paragraph(char*** paragraph) {
    int sentence_count;
    scanf("%d", &sentence_count);
    for (int i = 0; i < sentence_count; i++) {
        print_sentence(*(paragraph + i));
        printf(".");
    }
}

int main() 
{
    char* text = get_input_text();
    char**** document = get_document(text);

    int q;
    scanf("%d", &q);

    while (q--) {
        int type;
        scanf("%d", &type);

        if (type == 3){
            int k, m, n;
            scanf("%d %d %d", &k, &m, &n);
            char* word = kth_word_in_mth_sentence_of_nth_paragraph(document, k, m, n);
            print_word(word);
        }

        else if (type == 2){
            int k, m;
            scanf("%d %d", &k, &m);
            char** sentence = kth_sentence_in_mth_paragraph(document, k, m);
            print_sentence(sentence);
        }

        else{
            int k;
            scanf("%d", &k);
            char*** paragraph = kth_paragraph(document, k);
            print_paragraph(paragraph);
        }
        printf("\n");
    }     
}