package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmProfileYjtjTemp;
import cn.ibizlab.ehr.webapi.dto.PcmProfileYjtjTempDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmProfileYjtjTempMappingImpl implements PcmProfileYjtjTempMapping {

    @Override
    public PcmProfileYjtjTemp toDomain(PcmProfileYjtjTempDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmProfileYjtjTemp pcmProfileYjtjTemp = new PcmProfileYjtjTemp();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmProfileYjtjTemp.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmProfileYjtjTemp.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPcmprofileyjtjtempname() != null ) {
            pcmProfileYjtjTemp.setPcmprofileyjtjtempname( dto.getPcmprofileyjtjtempname() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmProfileYjtjTemp.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPcmprofileyjtjtempid() != null ) {
            pcmProfileYjtjTemp.setPcmprofileyjtjtempid( dto.getPcmprofileyjtjtempid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmProfileYjtjTemp.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmProfileYjtjTemp.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmProfileYjtjTemp.setUpdateman( dto.getUpdateman() );
        }

        return pcmProfileYjtjTemp;
    }

    @Override
    public PcmProfileYjtjTempDTO toDto(PcmProfileYjtjTemp entity) {
        if ( entity == null ) {
            return null;
        }

        PcmProfileYjtjTempDTO pcmProfileYjtjTempDTO = new PcmProfileYjtjTempDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmProfileYjtjTempDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmProfileYjtjTempDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPcmprofileyjtjtempname() != null ) {
            pcmProfileYjtjTempDTO.setPcmprofileyjtjtempname( entity.getPcmprofileyjtjtempname() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmProfileYjtjTempDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPcmprofileyjtjtempid() != null ) {
            pcmProfileYjtjTempDTO.setPcmprofileyjtjtempid( entity.getPcmprofileyjtjtempid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmProfileYjtjTempDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmProfileYjtjTempDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmProfileYjtjTempDTO.setUpdateman( entity.getUpdateman() );
        }

        return pcmProfileYjtjTempDTO;
    }

    @Override
    public List<PcmProfileYjtjTemp> toDomain(List<PcmProfileYjtjTempDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmProfileYjtjTemp> list = new ArrayList<PcmProfileYjtjTemp>( dtoList.size() );
        for ( PcmProfileYjtjTempDTO pcmProfileYjtjTempDTO : dtoList ) {
            list.add( toDomain( pcmProfileYjtjTempDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmProfileYjtjTempDTO> toDto(List<PcmProfileYjtjTemp> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmProfileYjtjTempDTO> list = new ArrayList<PcmProfileYjtjTempDTO>( entityList.size() );
        for ( PcmProfileYjtjTemp pcmProfileYjtjTemp : entityList ) {
            list.add( toDto( pcmProfileYjtjTemp ) );
        }

        return list;
    }
}
