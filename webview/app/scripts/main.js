console.log('\'Allo \'Allo!');

$().ready(
  function() {


    var iframe = '<iframe width="560" height="315" src="//www.youtube.com/embed/W-TE_Ys4iwM" frameborder="0" allowfullscreen></iframe>';

    var image = 'video-poster2.png';

    var video = 'graduation-video.mp4';

    $('#splendid').click(function(){

      $('#video_container').html('<video id="video" poster="http://1ddegree.carnivallabs.com.s3-website-us-east-1.amazonaws.com/images/' + image + '" autoplay="" controls="" webkit-playsinline=""><source src="http://1ddegree.carnivallabs.com.s3-website-us-east-1.amazonaws.com/videos/optimized/' + video +'"></video>');

    });

  }
)