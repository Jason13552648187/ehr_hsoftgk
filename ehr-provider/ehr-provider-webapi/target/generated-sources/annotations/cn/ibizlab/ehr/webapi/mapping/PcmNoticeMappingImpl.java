package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmNotice;
import cn.ibizlab.ehr.webapi.dto.PcmNoticeDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:44+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmNoticeMappingImpl implements PcmNoticeMapping {

    @Override
    public PcmNotice toDomain(PcmNoticeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmNotice pcmNotice = new PcmNotice();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmNotice.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmNotice.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSxrq() != null ) {
            pcmNotice.setSxrq( dto.getSxrq() );
        }
        if ( dto.getNoticetype() != null ) {
            pcmNotice.setNoticetype( dto.getNoticetype() );
        }
        if ( dto.getRoletype() != null ) {
            pcmNotice.setRoletype( dto.getRoletype() );
        }
        if ( dto.getDone() != null ) {
            pcmNotice.setDone( dto.getDone() );
        }
        if ( dto.getPcmnoticename() != null ) {
            pcmNotice.setPcmnoticename( dto.getPcmnoticename() );
        }
        if ( dto.getSsfw() != null ) {
            pcmNotice.setSsfw( dto.getSsfw() );
        }
        if ( dto.getNotice() != null ) {
            pcmNotice.setNotice( dto.getNotice() );
        }
        if ( dto.getYgbh() != null ) {
            pcmNotice.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmNotice.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPimdistirbutionid() != null ) {
            pcmNotice.setPimdistirbutionid( dto.getPimdistirbutionid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pcmNotice.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmNotice.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmNotice.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pcmNotice.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmNotice.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmNotice.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmNotice.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getPcmnoticeid() != null ) {
            pcmNotice.setPcmnoticeid( dto.getPcmnoticeid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmNotice.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmNotice.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getShortname() != null ) {
            pcmNotice.setShortname( dto.getShortname() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmNotice.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmNotice.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmNotice.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return pcmNotice;
    }

    @Override
    public PcmNoticeDTO toDto(PcmNotice entity) {
        if ( entity == null ) {
            return null;
        }

        PcmNoticeDTO pcmNoticeDTO = new PcmNoticeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmNoticeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmNoticeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSxrq() != null ) {
            pcmNoticeDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getNoticetype() != null ) {
            pcmNoticeDTO.setNoticetype( entity.getNoticetype() );
        }
        if ( entity.getRoletype() != null ) {
            pcmNoticeDTO.setRoletype( entity.getRoletype() );
        }
        if ( entity.getDone() != null ) {
            pcmNoticeDTO.setDone( entity.getDone() );
        }
        if ( entity.getPcmnoticename() != null ) {
            pcmNoticeDTO.setPcmnoticename( entity.getPcmnoticename() );
        }
        if ( entity.getSsfw() != null ) {
            pcmNoticeDTO.setSsfw( entity.getSsfw() );
        }
        if ( entity.getNotice() != null ) {
            pcmNoticeDTO.setNotice( entity.getNotice() );
        }
        if ( entity.getYgbh() != null ) {
            pcmNoticeDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmNoticeDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPimdistirbutionid() != null ) {
            pcmNoticeDTO.setPimdistirbutionid( entity.getPimdistirbutionid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pcmNoticeDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmNoticeDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmNoticeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pcmNoticeDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmNoticeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmNoticeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmNoticeDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getPcmnoticeid() != null ) {
            pcmNoticeDTO.setPcmnoticeid( entity.getPcmnoticeid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmNoticeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmNoticeDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getShortname() != null ) {
            pcmNoticeDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmNoticeDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmNoticeDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmNoticeDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return pcmNoticeDTO;
    }

    @Override
    public List<PcmNotice> toDomain(List<PcmNoticeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmNotice> list = new ArrayList<PcmNotice>( dtoList.size() );
        for ( PcmNoticeDTO pcmNoticeDTO : dtoList ) {
            list.add( toDomain( pcmNoticeDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmNoticeDTO> toDto(List<PcmNotice> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmNoticeDTO> list = new ArrayList<PcmNoticeDTO>( entityList.size() );
        for ( PcmNotice pcmNotice : entityList ) {
            list.add( toDto( pcmNotice ) );
        }

        return list;
    }
}
