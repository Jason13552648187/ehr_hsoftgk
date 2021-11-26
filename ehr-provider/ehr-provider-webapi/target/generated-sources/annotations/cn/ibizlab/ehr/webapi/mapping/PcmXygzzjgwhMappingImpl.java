package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmXygzzjgwh;
import cn.ibizlab.ehr.webapi.dto.PcmXygzzjgwhDTO;
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
public class PcmXygzzjgwhMappingImpl implements PcmXygzzjgwhMapping {

    @Override
    public PcmXygzzjgwh toDomain(PcmXygzzjgwhDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmXygzzjgwh pcmXygzzjgwh = new PcmXygzzjgwh();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmXygzzjgwh.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmXygzzjgwh.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNd() != null ) {
            pcmXygzzjgwh.setNd( dto.getNd() );
        }
        if ( dto.getBm() != null ) {
            pcmXygzzjgwh.setBm( dto.getBm() );
        }
        if ( dto.getYgbh() != null ) {
            pcmXygzzjgwh.setYgbh( dto.getYgbh() );
        }
        if ( dto.getZz() != null ) {
            pcmXygzzjgwh.setZz( dto.getZz() );
        }
        if ( dto.getKhjg() != null ) {
            pcmXygzzjgwh.setKhjg( dto.getKhjg() );
        }
        if ( dto.getPcmxygzzjgwhname() != null ) {
            pcmXygzzjgwh.setPcmxygzzjgwhname( dto.getPcmxygzzjgwhname() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmXygzzjgwh.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pcmXygzzjgwh.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmXygzzjgwh.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmxygzzjgwhid() != null ) {
            pcmXygzzjgwh.setPcmxygzzjgwhid( dto.getPcmxygzzjgwhid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmXygzzjgwh.setCreatedate( dto.getCreatedate() );
        }

        return pcmXygzzjgwh;
    }

    @Override
    public PcmXygzzjgwhDTO toDto(PcmXygzzjgwh entity) {
        if ( entity == null ) {
            return null;
        }

        PcmXygzzjgwhDTO pcmXygzzjgwhDTO = new PcmXygzzjgwhDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmXygzzjgwhDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmXygzzjgwhDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNd() != null ) {
            pcmXygzzjgwhDTO.setNd( entity.getNd() );
        }
        if ( entity.getBm() != null ) {
            pcmXygzzjgwhDTO.setBm( entity.getBm() );
        }
        if ( entity.getYgbh() != null ) {
            pcmXygzzjgwhDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getZz() != null ) {
            pcmXygzzjgwhDTO.setZz( entity.getZz() );
        }
        if ( entity.getKhjg() != null ) {
            pcmXygzzjgwhDTO.setKhjg( entity.getKhjg() );
        }
        if ( entity.getPcmxygzzjgwhname() != null ) {
            pcmXygzzjgwhDTO.setPcmxygzzjgwhname( entity.getPcmxygzzjgwhname() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmXygzzjgwhDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pcmXygzzjgwhDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmXygzzjgwhDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmxygzzjgwhid() != null ) {
            pcmXygzzjgwhDTO.setPcmxygzzjgwhid( entity.getPcmxygzzjgwhid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmXygzzjgwhDTO.setCreatedate( entity.getCreatedate() );
        }

        return pcmXygzzjgwhDTO;
    }

    @Override
    public List<PcmXygzzjgwh> toDomain(List<PcmXygzzjgwhDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmXygzzjgwh> list = new ArrayList<PcmXygzzjgwh>( dtoList.size() );
        for ( PcmXygzzjgwhDTO pcmXygzzjgwhDTO : dtoList ) {
            list.add( toDomain( pcmXygzzjgwhDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmXygzzjgwhDTO> toDto(List<PcmXygzzjgwh> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmXygzzjgwhDTO> list = new ArrayList<PcmXygzzjgwhDTO>( entityList.size() );
        for ( PcmXygzzjgwh pcmXygzzjgwh : entityList ) {
            list.add( toDto( pcmXygzzjgwh ) );
        }

        return list;
    }
}
