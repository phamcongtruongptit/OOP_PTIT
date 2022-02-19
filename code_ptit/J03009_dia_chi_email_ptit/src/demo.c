#include<stdio.h>
#include<string.h>
int kt(char s[],char a[]){ // kiem tra xau giong nhau hay khong
	int l=strlen(s);
	int n=strlen(a);
	if(l!=n) return 0;
	else{
        int i ; 
		for( i=0;i<l;i++){
			if(s[i]!=a[i]) return 0;
		}
		return 1;
	}
}
int main(){
	int t;
	char a[101],s[101][101];
	scanf("%d",&t);
	int j,k,h;
 for(k=0;k<t;k++){
    j=0;
	scanf("\n");
	gets(a);
	int d=0,i,vt,l=strlen(a);
	for(i=0;i<l;i++){
		if(a[i]>=65 && a[i]<=90) a[i]=a[i]+32;
	}
	
	while(a[d]==' '){
		d++;
	}
	while(a[l-1]==' '){
		l--;
	}
     for(i=l-1;i>=0;i--){
     	if(a[i]==' '){
     		break;
		 }
		 vt=i;
	 }
	 for(i=vt;i<l;i++){
	  s[k][j++]=a[i];
	 }

	 s[k][j++]=a[d];
	 for(i=d+1;i<vt;i++){
	 	if(a[i]!=' ' && a[i-1]==' ') s[k][j++]=a[i];
	 }
     
	 int dem=1;
     	for(h=0;h<k;h++){
     		if(kt(s[h],s[k])==1) dem++;
		 }
     	printf("%s",s[k]);
     	if(dem>1) printf("%d",dem);
     	printf("@ptit.edu.vn\n");
     }	 	 
}
