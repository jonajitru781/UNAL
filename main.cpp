#include <iostream>
using namespace std;

int** crear_matriz_int(int n, int m){
    int** X = new int*[n];
    for(int i = 0; i < n; i++){
        X[i] = new int[m];
    };
    return X;
};

int** leer_matriz(int** a, int n, int m){
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin >> a[i][j];
        }
    }return a;
}

int dif_2(int a, int b){
    if(a>=b){
        return a-b;
    }else{
        return b-a;
    }
}

int dif_vecinos(int** a, int n, int m){
    int c = a[1][1];
    int y = 0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(dif_2(c,a[i][j])>y){
                y = dif_2(c,a[i][j]);
            }
        }
    }return y;
}

int** alrededor(int** a, int n, int m,int f, int c){
    int** b = crear_matriz_int(3,3);
    for(int i=-1;i<=1;i++){
        for(int j=-1;j<=1;j++){
            b[i+1][j+1] = a[(i+f+n)%n][(j+c+m)%m];
        }
    }
    return b;
}

int** escribir(int** a, int n, int m){
    for(int i=0;i<n;i++){
        cout << "";
        for(int j=0;j<m;j++){
            cout << a[i][j] << " ";
        }cout << endl;
    }
    return a;
}

int** may_dif_mat(int** a, int n, int m){
    int** b = crear_matriz_int(n,m);
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            b[i][j] = dif_vecinos(alrededor(a,n,m,i,j),3,3);
        }
    }return b;
}

int main(){
    int n;
    cin >> n;
    int m;
    cin >> m;
    int** a = crear_matriz_int(n,m);
    a = leer_matriz(a,n,m);
    //escribir(a,n,m);
    cout << endl;
    int** h = may_dif_mat(a,n,m);
    escribir(h,n,m);
}










