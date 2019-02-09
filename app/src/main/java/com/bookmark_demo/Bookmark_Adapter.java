package com.bookmark_demo;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Bookmark_Adapter extends BaseAdapter {
	private ArrayList<BookmarkModel> arrayList;
	private Context context;

	public Bookmark_Adapter(Context context, ArrayList<BookmarkModel> arrayList) {
		this.context = context;
		this.arrayList = arrayList;
	}

	@Override
	public int getCount() {

		return arrayList.size();
	}

	@Override
	public BookmarkModel getItem(int position) {

		return arrayList.get(position);
	}

	@Override
	public long getItemId(int position) {

		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (view == null) {
			view = inflater.inflate(R.layout.custom_view, parent, false);
			TextView title = (TextView) view.findViewById(R.id.bookmar_title);
			TextView url = (TextView) view.findViewById(R.id.bookmark_url);

			title.setText(arrayList.get(position).getBookmarkTitle());
			url.setText(arrayList.get(position).getBookmarkUrl());

		}
		return view;
	}
}
