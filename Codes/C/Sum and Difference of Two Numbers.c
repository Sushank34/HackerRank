#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
  int x, y;
  float x1, y1;
  scanf("%d%d", &x, &y);
  scanf("%f%f", &x1, &y1);
  printf("%d %d\n", (x + y), (x - y));
  printf("%.1f %.1f", (x1 + y1), (x1 - y1));

  return 0;
}
