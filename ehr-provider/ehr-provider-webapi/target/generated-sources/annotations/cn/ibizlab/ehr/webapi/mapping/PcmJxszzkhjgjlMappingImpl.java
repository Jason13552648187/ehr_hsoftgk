package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmJxszzkhjgjl;
import cn.ibizlab.ehr.webapi.dto.PcmJxszzkhjgjlDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmJxszzkhjgjlMappingImpl implements PcmJxszzkhjgjlMapping {

    @Override
    public PcmJxszzkhjgjl toDomain(PcmJxszzkhjgjlDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmJxszzkhjgjl pcmJxszzkhjgjl = new PcmJxszzkhjgjl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmJxszzkhjgjl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmJxszzkhjgjl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getEnable() != null ) {
            pcmJxszzkhjgjl.setEnable( dto.getEnable() );
        }
        if ( dto.getPj() != null ) {
            pcmJxszzkhjgjl.setPj( dto.getPj() );
        }
        if ( dto.getPcmjxszzkhjgjlname() != null ) {
            pcmJxszzkhjgjl.setPcmjxszzkhjgjlname( dto.getPcmjxszzkhjgjlname() );
        }
        if ( dto.getYgbh() != null ) {
            pcmJxszzkhjgjl.setYgbh( dto.getYgbh() );
        }
        if ( dto.getJssj() != null ) {
            pcmJxszzkhjgjl.setJssj( dto.getJssj() );
        }
        if ( dto.getFs() != null ) {
            pcmJxszzkhjgjl.setFs( dto.getFs() );
        }
        if ( dto.getQssj() != null ) {
            pcmJxszzkhjgjl.setQssj( dto.getQssj() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmJxszzkhjgjl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmJxszzkhjgjl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmJxszzkhjgjl.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmJxszzkhjgjl.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmjxszzkhjgjlid() != null ) {
            pcmJxszzkhjgjl.setPcmjxszzkhjgjlid( dto.getPcmjxszzkhjgjlid() );
        }

        return pcmJxszzkhjgjl;
    }

    @Override
    public PcmJxszzkhjgjlDTO toDto(PcmJxszzkhjgjl entity) {
        if ( entity == null ) {
            return null;
        }

        PcmJxszzkhjgjlDTO pcmJxszzkhjgjlDTO = new PcmJxszzkhjgjlDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmJxszzkhjgjlDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmJxszzkhjgjlDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getEnable() != null ) {
            pcmJxszzkhjgjlDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getPj() != null ) {
            pcmJxszzkhjgjlDTO.setPj( entity.getPj() );
        }
        if ( entity.getPcmjxszzkhjgjlname() != null ) {
            pcmJxszzkhjgjlDTO.setPcmjxszzkhjgjlname( entity.getPcmjxszzkhjgjlname() );
        }
        if ( entity.getYgbh() != null ) {
            pcmJxszzkhjgjlDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getJssj() != null ) {
            pcmJxszzkhjgjlDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getFs() != null ) {
            pcmJxszzkhjgjlDTO.setFs( entity.getFs() );
        }
        if ( entity.getQssj() != null ) {
            pcmJxszzkhjgjlDTO.setQssj( entity.getQssj() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmJxszzkhjgjlDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmJxszzkhjgjlDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmJxszzkhjgjlDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmJxszzkhjgjlDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmjxszzkhjgjlid() != null ) {
            pcmJxszzkhjgjlDTO.setPcmjxszzkhjgjlid( entity.getPcmjxszzkhjgjlid() );
        }

        return pcmJxszzkhjgjlDTO;
    }

    @Override
    public List<PcmJxszzkhjgjl> toDomain(List<PcmJxszzkhjgjlDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmJxszzkhjgjl> list = new ArrayList<PcmJxszzkhjgjl>( dtoList.size() );
        for ( PcmJxszzkhjgjlDTO pcmJxszzkhjgjlDTO : dtoList ) {
            list.add( toDomain( pcmJxszzkhjgjlDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmJxszzkhjgjlDTO> toDto(List<PcmJxszzkhjgjl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmJxszzkhjgjlDTO> list = new ArrayList<PcmJxszzkhjgjlDTO>( entityList.size() );
        for ( PcmJxszzkhjgjl pcmJxszzkhjgjl : entityList ) {
            list.add( toDto( pcmJxszzkhjgjl ) );
        }

        return list;
    }
}
