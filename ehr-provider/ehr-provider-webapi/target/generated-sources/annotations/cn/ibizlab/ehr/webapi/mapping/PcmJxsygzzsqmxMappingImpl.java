package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmJxsygzzsqmx;
import cn.ibizlab.ehr.webapi.dto.PcmJxsygzzsqmxDTO;
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
    date = "2021-09-04T00:31:54+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmJxsygzzsqmxMappingImpl implements PcmJxsygzzsqmxMapping {

    @Override
    public PcmJxsygzzsqmx toDomain(PcmJxsygzzsqmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmJxsygzzsqmx pcmJxsygzzsqmx = new PcmJxsygzzsqmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmJxsygzzsqmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmJxsygzzsqmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getStatus() != null ) {
            pcmJxsygzzsqmx.setStatus( dto.getStatus() );
        }
        if ( dto.getPcmjxsygzzsqmxname() != null ) {
            pcmJxsygzzsqmx.setPcmjxsygzzsqmxname( dto.getPcmjxsygzzsqmxname() );
        }
        if ( dto.getBm() != null ) {
            pcmJxsygzzsqmx.setBm( dto.getBm() );
        }
        if ( dto.getZz() != null ) {
            pcmJxsygzzsqmx.setZz( dto.getZz() );
        }
        if ( dto.getGw() != null ) {
            pcmJxsygzzsqmx.setGw( dto.getGw() );
        }
        if ( dto.getZj() != null ) {
            pcmJxsygzzsqmx.setZj( dto.getZj() );
        }
        if ( dto.getZw() != null ) {
            pcmJxsygzzsqmx.setZw( dto.getZw() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmJxsygzzsqmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPcmjxsygzzsqid() != null ) {
            pcmJxsygzzsqmx.setPcmjxsygzzsqid( dto.getPcmjxsygzzsqid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmJxsygzzsqmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmJxsygzzsqmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmJxsygzzsqmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmjxsygzzsqmxid() != null ) {
            pcmJxsygzzsqmx.setPcmjxsygzzsqmxid( dto.getPcmjxsygzzsqmxid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmJxsygzzsqmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmJxsygzzsqmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getPcmjxsygzzsqname() != null ) {
            pcmJxsygzzsqmx.setPcmjxsygzzsqname( dto.getPcmjxsygzzsqname() );
        }

        return pcmJxsygzzsqmx;
    }

    @Override
    public PcmJxsygzzsqmxDTO toDto(PcmJxsygzzsqmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmJxsygzzsqmxDTO pcmJxsygzzsqmxDTO = new PcmJxsygzzsqmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmJxsygzzsqmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmJxsygzzsqmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getStatus() != null ) {
            pcmJxsygzzsqmxDTO.setStatus( entity.getStatus() );
        }
        if ( entity.getPcmjxsygzzsqmxname() != null ) {
            pcmJxsygzzsqmxDTO.setPcmjxsygzzsqmxname( entity.getPcmjxsygzzsqmxname() );
        }
        if ( entity.getBm() != null ) {
            pcmJxsygzzsqmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getZz() != null ) {
            pcmJxsygzzsqmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getGw() != null ) {
            pcmJxsygzzsqmxDTO.setGw( entity.getGw() );
        }
        if ( entity.getZj() != null ) {
            pcmJxsygzzsqmxDTO.setZj( entity.getZj() );
        }
        if ( entity.getZw() != null ) {
            pcmJxsygzzsqmxDTO.setZw( entity.getZw() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmJxsygzzsqmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPcmjxsygzzsqid() != null ) {
            pcmJxsygzzsqmxDTO.setPcmjxsygzzsqid( entity.getPcmjxsygzzsqid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmJxsygzzsqmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmJxsygzzsqmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmJxsygzzsqmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmjxsygzzsqmxid() != null ) {
            pcmJxsygzzsqmxDTO.setPcmjxsygzzsqmxid( entity.getPcmjxsygzzsqmxid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmJxsygzzsqmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmJxsygzzsqmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getPcmjxsygzzsqname() != null ) {
            pcmJxsygzzsqmxDTO.setPcmjxsygzzsqname( entity.getPcmjxsygzzsqname() );
        }

        return pcmJxsygzzsqmxDTO;
    }

    @Override
    public List<PcmJxsygzzsqmx> toDomain(List<PcmJxsygzzsqmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmJxsygzzsqmx> list = new ArrayList<PcmJxsygzzsqmx>( dtoList.size() );
        for ( PcmJxsygzzsqmxDTO pcmJxsygzzsqmxDTO : dtoList ) {
            list.add( toDomain( pcmJxsygzzsqmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmJxsygzzsqmxDTO> toDto(List<PcmJxsygzzsqmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmJxsygzzsqmxDTO> list = new ArrayList<PcmJxsygzzsqmxDTO>( entityList.size() );
        for ( PcmJxsygzzsqmx pcmJxsygzzsqmx : entityList ) {
            list.add( toDto( pcmJxsygzzsqmx ) );
        }

        return list;
    }
}
