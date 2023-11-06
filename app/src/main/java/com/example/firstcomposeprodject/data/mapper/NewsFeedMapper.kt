package com.example.firstcomposeprodject.data.mapper

import com.example.firstcomposeprodject.data.model.CommentsResponseDto
import com.example.firstcomposeprodject.data.model.NewsFeedResponse
import com.example.firstcomposeprodject.domain.entity.FeedPost
import com.example.firstcomposeprodject.domain.entity.PostComment
import com.example.firstcomposeprodject.domain.entity.StatisticItem
import com.example.firstcomposeprodject.domain.entity.StatisticType
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject
import kotlin.math.absoluteValue

class NewsFeedMapper @Inject constructor() {

    fun mapResponseToPosts(responseDto: NewsFeedResponse): List<FeedPost> {
        val result = mutableListOf<FeedPost>()

        val posts = responseDto.newsFeedContent.posts
        val groups = responseDto.newsFeedContent.groups

        for (post in posts) {
            val group = groups.find { it.id == post.communityId.absoluteValue } ?: break
            val feedPost = FeedPost(
                id = post.id,
                communityId = post.communityId,
                communityName = group.name,
                publicationDate = mapTimestampToDate(post.date),
                communityImageUrl = group.imgUrl,
                contentText = post.text,
                contentImgUrl = post.attachments?.firstOrNull()?.photo?.photoUrl?.lastOrNull()?.url,
                statistics = listOf(
                    StatisticItem(type = StatisticType.LIKES, post.likes.count),
                    StatisticItem(type = StatisticType.VIEWS, post.views.count),
                    StatisticItem(type = StatisticType.SHARES, post.reposts.count),
                    StatisticItem(type = StatisticType.COMMENTS, post.comments.count)
                ),
                isLiked = post.likes.userLikes > 0
            )
            result.add(feedPost)
        }
        return result
    }

    fun mapResponseToComment(response: CommentsResponseDto): List<PostComment>{
        val result = mutableListOf<PostComment>()
        val comments = response.content.comments
        val profile = response.content.profiles
        for (comment in comments){
            if (comment.text.isBlank()) continue
            val author = profile.firstOrNull{it.id == comment.authorId} ?: continue
            val postComment = PostComment(
                id = comment.id,
                authorName = "${author.firstName} ${author.lastName}",
                authorAvatarUrl = author.photoUrl,
                commentText = comment.text,
                publicationDate = mapTimestampToDate(comment.date)
            )
            result.add(postComment)
        }
        return result
    }

    private fun mapTimestampToDate(timestamp: Long): String {
        val date = Date(timestamp * 1000)
        return SimpleDateFormat("d MMMM yyyy, hh:mm", Locale.getDefault()).format(date)
    }
}