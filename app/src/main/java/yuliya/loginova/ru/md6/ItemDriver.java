package yuliya.loginova.ru.md6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

class ItemDivider extends RecyclerView.ItemDecoration {
    private final Drawable divider;

    public ItemDivider(Context context) {
        int[] attrs = {android.R.attr.listDivider};
        divider = context.obtainStyledAttributes(attrs).getDrawable(0);
    }

    // Рисование разделителей элементов списка в RecyclerView
    @Override
    public void onDrawOver(Canvas c, RecyclerView parent,
                           RecyclerView.State state) {
        super.onDrawOver(c, parent, state);

        // Вычисление координат x для всех разделителей
//        int left = parent.getPaddingLeft();
        int left = parent.getPaddingLeft() + 300;
        int right = parent.getWidth() - parent.getPaddingRight();

        // Для каждого элемента, кроме последнего, нарисовать линию
        for (int i = 0; i < parent.getChildCount() - 1; ++i) {
            View item = parent.getChildAt(i);// Получить i-й элемент списка

            // Вычисление координат y текущего разделителя
            int top = item.getBottom() + ((RecyclerView.LayoutParams) item.getLayoutParams()).bottomMargin;
            int bottom = top + divider.getIntrinsicHeight();

            // Рисование разделителя с вычисленными границами
            divider.setBounds(left, top, right, bottom);
            divider.draw(c);
        }
    }
}
