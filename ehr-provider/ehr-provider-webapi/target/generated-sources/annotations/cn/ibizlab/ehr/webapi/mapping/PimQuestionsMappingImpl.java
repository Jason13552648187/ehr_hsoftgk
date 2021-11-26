package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimQuestions;
import cn.ibizlab.ehr.webapi.dto.PimQuestionsDTO;
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
public class PimQuestionsMappingImpl implements PimQuestionsMapping {

    @Override
    public PimQuestions toDomain(PimQuestionsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimQuestions pimQuestions = new PimQuestions();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimQuestions.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimQuestions.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getQuestionman() != null ) {
            pimQuestions.setQuestionman( dto.getQuestionman() );
        }
        if ( dto.getTwurl() != null ) {
            pimQuestions.setTwurl( dto.getTwurl() );
        }
        if ( dto.getJjcd() != null ) {
            pimQuestions.setJjcd( dto.getJjcd() );
        }
        if ( dto.getYmmc() != null ) {
            pimQuestions.setYmmc( dto.getYmmc() );
        }
        if ( dto.getYm() != null ) {
            pimQuestions.setYm( dto.getYm() );
        }
        if ( dto.getGn() != null ) {
            pimQuestions.setGn( dto.getGn() );
        }
        if ( dto.getJt() != null ) {
            pimQuestions.setJt( dto.getJt() );
        }
        if ( dto.getWtfk() != null ) {
            pimQuestions.setWtfk( dto.getWtfk() );
        }
        if ( dto.getLxdh() != null ) {
            pimQuestions.setLxdh( dto.getLxdh() );
        }
        if ( dto.getWtms() != null ) {
            pimQuestions.setWtms( dto.getWtms() );
        }
        if ( dto.getMk() != null ) {
            pimQuestions.setMk( dto.getMk() );
        }
        if ( dto.getQuestionsname() != null ) {
            pimQuestions.setQuestionsname( dto.getQuestionsname() );
        }
        if ( dto.getKfz() != null ) {
            pimQuestions.setKfz( dto.getKfz() );
        }
        if ( dto.getTcsj() != null ) {
            pimQuestions.setTcsj( dto.getTcsj() );
        }
        if ( dto.getWcsj() != null ) {
            pimQuestions.setWcsj( dto.getWcsj() );
        }
        if ( dto.getWtzt() != null ) {
            pimQuestions.setWtzt( dto.getWtzt() );
        }
        if ( dto.getWtbh() != null ) {
            pimQuestions.setWtbh( dto.getWtbh() );
        }
        if ( dto.getCreateman() != null ) {
            pimQuestions.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimQuestions.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimQuestions.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimQuestions.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getQuestionsid() != null ) {
            pimQuestions.setQuestionsid( dto.getQuestionsid() );
        }

        return pimQuestions;
    }

    @Override
    public PimQuestionsDTO toDto(PimQuestions entity) {
        if ( entity == null ) {
            return null;
        }

        PimQuestionsDTO pimQuestionsDTO = new PimQuestionsDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimQuestionsDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimQuestionsDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getQuestionman() != null ) {
            pimQuestionsDTO.setQuestionman( entity.getQuestionman() );
        }
        if ( entity.getTwurl() != null ) {
            pimQuestionsDTO.setTwurl( entity.getTwurl() );
        }
        if ( entity.getJjcd() != null ) {
            pimQuestionsDTO.setJjcd( entity.getJjcd() );
        }
        if ( entity.getYmmc() != null ) {
            pimQuestionsDTO.setYmmc( entity.getYmmc() );
        }
        if ( entity.getYm() != null ) {
            pimQuestionsDTO.setYm( entity.getYm() );
        }
        if ( entity.getGn() != null ) {
            pimQuestionsDTO.setGn( entity.getGn() );
        }
        if ( entity.getJt() != null ) {
            pimQuestionsDTO.setJt( entity.getJt() );
        }
        if ( entity.getWtfk() != null ) {
            pimQuestionsDTO.setWtfk( entity.getWtfk() );
        }
        if ( entity.getLxdh() != null ) {
            pimQuestionsDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getWtms() != null ) {
            pimQuestionsDTO.setWtms( entity.getWtms() );
        }
        if ( entity.getMk() != null ) {
            pimQuestionsDTO.setMk( entity.getMk() );
        }
        if ( entity.getQuestionsname() != null ) {
            pimQuestionsDTO.setQuestionsname( entity.getQuestionsname() );
        }
        if ( entity.getKfz() != null ) {
            pimQuestionsDTO.setKfz( entity.getKfz() );
        }
        if ( entity.getTcsj() != null ) {
            pimQuestionsDTO.setTcsj( entity.getTcsj() );
        }
        if ( entity.getWcsj() != null ) {
            pimQuestionsDTO.setWcsj( entity.getWcsj() );
        }
        if ( entity.getWtzt() != null ) {
            pimQuestionsDTO.setWtzt( entity.getWtzt() );
        }
        if ( entity.getWtbh() != null ) {
            pimQuestionsDTO.setWtbh( entity.getWtbh() );
        }
        if ( entity.getCreateman() != null ) {
            pimQuestionsDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimQuestionsDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimQuestionsDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimQuestionsDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getQuestionsid() != null ) {
            pimQuestionsDTO.setQuestionsid( entity.getQuestionsid() );
        }

        return pimQuestionsDTO;
    }

    @Override
    public List<PimQuestions> toDomain(List<PimQuestionsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimQuestions> list = new ArrayList<PimQuestions>( dtoList.size() );
        for ( PimQuestionsDTO pimQuestionsDTO : dtoList ) {
            list.add( toDomain( pimQuestionsDTO ) );
        }

        return list;
    }

    @Override
    public List<PimQuestionsDTO> toDto(List<PimQuestions> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimQuestionsDTO> list = new ArrayList<PimQuestionsDTO>( entityList.size() );
        for ( PimQuestions pimQuestions : entityList ) {
            list.add( toDto( pimQuestions ) );
        }

        return list;
    }
}
