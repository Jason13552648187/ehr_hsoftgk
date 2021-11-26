package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmJxsgz;
import cn.ibizlab.ehr.webapi.dto.PcmJxsgzDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmJxsgzMappingImpl implements PcmJxsgzMapping {

    @Override
    public PcmJxsgz toDomain(PcmJxsgzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmJxsgz pcmJxsgz = new PcmJxsgz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmJxsgz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmJxsgz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJxqjs() != null ) {
            pcmJxsgz.setJxqjs( dto.getJxqjs() );
        }
        if ( dto.getKsrq() != null ) {
            pcmJxsgz.setKsrq( dto.getKsrq() );
        }
        if ( dto.getXllx() != null ) {
            pcmJxsgz.setXllx( dto.getXllx() );
        }
        if ( dto.getApplyedu() != null ) {
            pcmJxsgz.setApplyedu( dto.getApplyedu() );
        }
        if ( dto.getDuration() != null ) {
            pcmJxsgz.setDuration( dto.getDuration() );
        }
        if ( dto.getPcmjxsgzname() != null ) {
            pcmJxsgz.setPcmjxsgzname( dto.getPcmjxsgzname() );
        }
        if ( dto.getJsrq() != null ) {
            pcmJxsgz.setJsrq( dto.getJsrq() );
        }
        if ( dto.getXh() != null ) {
            pcmJxsgz.setXh( dto.getXh() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmJxsgz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmjxsgzid() != null ) {
            pcmJxsgz.setPcmjxsgzid( dto.getPcmjxsgzid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmJxsgz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmJxsgz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmJxsgz.setCreatedate( dto.getCreatedate() );
        }

        return pcmJxsgz;
    }

    @Override
    public PcmJxsgzDTO toDto(PcmJxsgz entity) {
        if ( entity == null ) {
            return null;
        }

        PcmJxsgzDTO pcmJxsgzDTO = new PcmJxsgzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmJxsgzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmJxsgzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJxqjs() != null ) {
            pcmJxsgzDTO.setJxqjs( entity.getJxqjs() );
        }
        if ( entity.getKsrq() != null ) {
            pcmJxsgzDTO.setKsrq( entity.getKsrq() );
        }
        if ( entity.getXllx() != null ) {
            pcmJxsgzDTO.setXllx( entity.getXllx() );
        }
        if ( entity.getApplyedu() != null ) {
            pcmJxsgzDTO.setApplyedu( entity.getApplyedu() );
        }
        if ( entity.getDuration() != null ) {
            pcmJxsgzDTO.setDuration( entity.getDuration() );
        }
        if ( entity.getPcmjxsgzname() != null ) {
            pcmJxsgzDTO.setPcmjxsgzname( entity.getPcmjxsgzname() );
        }
        if ( entity.getJsrq() != null ) {
            pcmJxsgzDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getXh() != null ) {
            pcmJxsgzDTO.setXh( entity.getXh() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmJxsgzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmjxsgzid() != null ) {
            pcmJxsgzDTO.setPcmjxsgzid( entity.getPcmjxsgzid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmJxsgzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmJxsgzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmJxsgzDTO.setCreatedate( entity.getCreatedate() );
        }

        return pcmJxsgzDTO;
    }

    @Override
    public List<PcmJxsgz> toDomain(List<PcmJxsgzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmJxsgz> list = new ArrayList<PcmJxsgz>( dtoList.size() );
        for ( PcmJxsgzDTO pcmJxsgzDTO : dtoList ) {
            list.add( toDomain( pcmJxsgzDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmJxsgzDTO> toDto(List<PcmJxsgz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmJxsgzDTO> list = new ArrayList<PcmJxsgzDTO>( entityList.size() );
        for ( PcmJxsgz pcmJxsgz : entityList ) {
            list.add( toDto( pcmJxsgz ) );
        }

        return list;
    }
}
