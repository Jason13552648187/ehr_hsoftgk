package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PCMGxxkTemp;
import cn.ibizlab.ehr.webapi.dto.PCMGxxkTempDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PCMGxxkTempMappingImpl implements PCMGxxkTempMapping {

    @Override
    public PCMGxxkTemp toDomain(PCMGxxkTempDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PCMGxxkTemp pCMGxxkTemp = new PCMGxxkTemp();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pCMGxxkTemp.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pCMGxxkTemp.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPcmgxxktempname() != null ) {
            pCMGxxkTemp.setPcmgxxktempname( dto.getPcmgxxktempname() );
        }
        if ( dto.getPcmxkmlid() != null ) {
            pCMGxxkTemp.setPcmxkmlid( dto.getPcmxkmlid() );
        }
        if ( dto.getPcmgxmlid() != null ) {
            pCMGxxkTemp.setPcmgxmlid( dto.getPcmgxmlid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pCMGxxkTemp.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pCMGxxkTemp.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pCMGxxkTemp.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmgxxktempid() != null ) {
            pCMGxxkTemp.setPcmgxxktempid( dto.getPcmgxxktempid() );
        }
        if ( dto.getCreateman() != null ) {
            pCMGxxkTemp.setCreateman( dto.getCreateman() );
        }
        if ( dto.getNd() != null ) {
            pCMGxxkTemp.setNd( dto.getNd() );
        }
        if ( dto.getNd2() != null ) {
            pCMGxxkTemp.setNd2( dto.getNd2() );
        }
        if ( dto.getPcmgxmlname() != null ) {
            pCMGxxkTemp.setPcmgxmlname( dto.getPcmgxmlname() );
        }
        if ( dto.getPcmxkmlname() != null ) {
            pCMGxxkTemp.setPcmxkmlname( dto.getPcmxkmlname() );
        }

        return pCMGxxkTemp;
    }

    @Override
    public PCMGxxkTempDTO toDto(PCMGxxkTemp entity) {
        if ( entity == null ) {
            return null;
        }

        PCMGxxkTempDTO pCMGxxkTempDTO = new PCMGxxkTempDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pCMGxxkTempDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pCMGxxkTempDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPcmgxxktempname() != null ) {
            pCMGxxkTempDTO.setPcmgxxktempname( entity.getPcmgxxktempname() );
        }
        if ( entity.getPcmxkmlid() != null ) {
            pCMGxxkTempDTO.setPcmxkmlid( entity.getPcmxkmlid() );
        }
        if ( entity.getPcmgxmlid() != null ) {
            pCMGxxkTempDTO.setPcmgxmlid( entity.getPcmgxmlid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pCMGxxkTempDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pCMGxxkTempDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pCMGxxkTempDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmgxxktempid() != null ) {
            pCMGxxkTempDTO.setPcmgxxktempid( entity.getPcmgxxktempid() );
        }
        if ( entity.getCreateman() != null ) {
            pCMGxxkTempDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getNd() != null ) {
            pCMGxxkTempDTO.setNd( entity.getNd() );
        }
        if ( entity.getNd2() != null ) {
            pCMGxxkTempDTO.setNd2( entity.getNd2() );
        }
        if ( entity.getPcmgxmlname() != null ) {
            pCMGxxkTempDTO.setPcmgxmlname( entity.getPcmgxmlname() );
        }
        if ( entity.getPcmxkmlname() != null ) {
            pCMGxxkTempDTO.setPcmxkmlname( entity.getPcmxkmlname() );
        }

        return pCMGxxkTempDTO;
    }

    @Override
    public List<PCMGxxkTemp> toDomain(List<PCMGxxkTempDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PCMGxxkTemp> list = new ArrayList<PCMGxxkTemp>( dtoList.size() );
        for ( PCMGxxkTempDTO pCMGxxkTempDTO : dtoList ) {
            list.add( toDomain( pCMGxxkTempDTO ) );
        }

        return list;
    }

    @Override
    public List<PCMGxxkTempDTO> toDto(List<PCMGxxkTemp> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PCMGxxkTempDTO> list = new ArrayList<PCMGxxkTempDTO>( entityList.size() );
        for ( PCMGxxkTemp pCMGxxkTemp : entityList ) {
            list.add( toDto( pCMGxxkTemp ) );
        }

        return list;
    }
}
