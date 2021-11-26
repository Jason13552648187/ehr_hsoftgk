package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmZpmeglmx;
import cn.ibizlab.ehr.webapi.dto.PcmZpmeglmxDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmZpmeglmxMappingImpl implements PcmZpmeglmxMapping {

    @Override
    public PcmZpmeglmx toDomain(PcmZpmeglmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmZpmeglmx pcmZpmeglmx = new PcmZpmeglmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmZpmeglmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmZpmeglmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPfrq() != null ) {
            pcmZpmeglmx.setPfrq( dto.getPfrq() );
        }
        if ( dto.getPcmzpmeglmxname() != null ) {
            pcmZpmeglmx.setPcmzpmeglmxname( dto.getPcmzpmeglmxname() );
        }
        if ( dto.getPcmzpmeglid() != null ) {
            pcmZpmeglmx.setPcmzpmeglid( dto.getPcmzpmeglid() );
        }
        if ( dto.getPcmzpmeglmxid() != null ) {
            pcmZpmeglmx.setPcmzpmeglmxid( dto.getPcmzpmeglmxid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmZpmeglmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmZpmeglmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmZpmeglmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmZpmeglmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPcmzpmeglname() != null ) {
            pcmZpmeglmx.setPcmzpmeglname( dto.getPcmzpmeglname() );
        }

        return pcmZpmeglmx;
    }

    @Override
    public PcmZpmeglmxDTO toDto(PcmZpmeglmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmZpmeglmxDTO pcmZpmeglmxDTO = new PcmZpmeglmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmZpmeglmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmZpmeglmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPfrq() != null ) {
            pcmZpmeglmxDTO.setPfrq( entity.getPfrq() );
        }
        if ( entity.getPcmzpmeglmxname() != null ) {
            pcmZpmeglmxDTO.setPcmzpmeglmxname( entity.getPcmzpmeglmxname() );
        }
        if ( entity.getPcmzpmeglid() != null ) {
            pcmZpmeglmxDTO.setPcmzpmeglid( entity.getPcmzpmeglid() );
        }
        if ( entity.getPcmzpmeglmxid() != null ) {
            pcmZpmeglmxDTO.setPcmzpmeglmxid( entity.getPcmzpmeglmxid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmZpmeglmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmZpmeglmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmZpmeglmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmZpmeglmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPcmzpmeglname() != null ) {
            pcmZpmeglmxDTO.setPcmzpmeglname( entity.getPcmzpmeglname() );
        }

        return pcmZpmeglmxDTO;
    }

    @Override
    public List<PcmZpmeglmx> toDomain(List<PcmZpmeglmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmZpmeglmx> list = new ArrayList<PcmZpmeglmx>( dtoList.size() );
        for ( PcmZpmeglmxDTO pcmZpmeglmxDTO : dtoList ) {
            list.add( toDomain( pcmZpmeglmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmZpmeglmxDTO> toDto(List<PcmZpmeglmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmZpmeglmxDTO> list = new ArrayList<PcmZpmeglmxDTO>( entityList.size() );
        for ( PcmZpmeglmx pcmZpmeglmx : entityList ) {
            list.add( toDto( pcmZpmeglmx ) );
        }

        return list;
    }
}
